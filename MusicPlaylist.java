//Carlinbhert Adryanne De Guzman
//CITCS 1N - A
//CC2 Final Challenge No. 4
//December 3, 2024

class MusicPlaylist {
    private Node head;
    private Node currentSong;

    // song node
    private class Node {
        String song;
        Node next;
        Node prev;

        Node(String song) {
            this.song = song;
            this.next = null;
            this.prev = null;
        }
    }

    // constructor for music playlist
    public MusicPlaylist() {
        this.head = null;
        this.currentSong = null;
    }

    // song gets added
    public void addSong(String songName) {
        Node newNode = new Node(songName);

//        if else to check if empty
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            currentSong = head;
        } else {
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // song removal
    public void removeSong(String songName) {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Node temp = head;
        do {
            if (temp.song.equals(songName)) {
                // If node to remove is the only node
                if (temp == head && temp.next == head) {
                    head = null;
                    currentSong = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    if (temp == head) {
                        head = temp.next;  // Move head if the head node is being removed
                    }
                }
                System.out.println("Song " + songName + " removed.");
                return;
            }
            temp = temp.next;
        } while (temp != head);  // Loop until we complete the circle

        System.out.println("Song not found in the playlist.");
    }

    // next song gets played
    public void nextSong() {
        if (currentSong != null) {
            currentSong = currentSong.next;
            System.out.println("Now playing: " + currentSong.song);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // previous song gets played
    public void prevSong() {
        if (currentSong != null) {
            currentSong = currentSong.prev;
            System.out.println("Now playing: " + currentSong.song);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // song gets displayed
    public void CurrentSong() {
        if (currentSong != null) {
            System.out.println("Currently playing: " + currentSong.song);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // playlist is showed with if statement in case it is empty
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.song + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }

//    main method
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        // 3 songs get added
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");

        // playlist is displayed
        playlist.displayPlaylist();
        // current song displayed
        playlist.CurrentSong();
        // next song gets played
        playlist.nextSong();
        // previous song is played
        playlist.prevSong();
        // song gets removed
        playlist.removeSong("Song 2");
    }
}
