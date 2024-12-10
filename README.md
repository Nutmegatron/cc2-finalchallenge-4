# cc2-finalchallenge-4

Option 1) Browser History Navigation

Objective: Implement a Doubly Linked List to simulate the browsing history feature in a web browser.
Scenario:

You are building a simplified version of a browser’s history feature. Each web page the user visits will be stored as a node in a linked list. The user should be able to:

    Go back to the previous page.
    Go forward to the next page.
    Visit a new page (which clears forward history if the user had previously gone back).

Requirements:

    Add a New Page: Add a node to represent a new page being visited.
    Go Back: Move to the previous node (page).
    Go Forward: Move to the next node (page) if available.
    Clear Forward History: When visiting a new page after going back, remove all nodes after the current one.

 
Option 2) Music Playlist Manager

Objective: Implement a Circular Doubly Linked List to manage a music playlist that supports continuous looping.
Scenario:

You are creating a music playlist application. The playlist is circular, meaning it loops back to the beginning after reaching the end. You should be able to:

    Add a song to the playlist.
    Remove a song from the playlist.
    Move to the next or previous song.
    Display the current song and playlist.

Requirements:

    Add Song: Insert a song node into the playlist.
    Remove Song: Delete a song from the playlist, adjusting links to maintain the circular structure.
    Next and Previous: Move forward or backward through the playlist.
    Loop Continuously: When reaching the end, the playlist should loop back to the first song.
