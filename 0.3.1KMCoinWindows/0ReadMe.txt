KMCoin0.3.1

Copyright (c) 2025 Charles F Morgan II
Distributed under the MIT/X11 software license. 
https://github.com/tinhatcat
www.thekittymine.com


Intro
-----
KittyMineCoin is an electronic money system that
reads the local Minecraft log of a player within
the play.thekittymine.com Minecraft server. It's
design, in conjunction with the data packs found
in this folder, ensures that server operator may
not alter the functionality of this money system
in any way. If the server is compromised somehow
then the ledger will not be affected and players
simply need to create another server, adjust the
block number and resume KittyMineCoin. It is not
required that the original operator maintain the
server. Barring the central node that is a Mine-
craft server, this system is truly decentralized


Operating Systems
-----------------
Windows 10/11 (Whatever will run Minecraft/Java)


Setup
-----
Install Java. Many older versions will work
Place all files in Minecraft local log file
Type 'javac *.java' in cmd within directory
AppData/Roaming/.minecraft/logs/KMCoin0.1.0
Enter 'java KMCoin.java' into cmd to run...


Hash
----
//certutil -hashfile 0ReadMe.txt SHA256
//229a8f30086a1915f82646390c1734691c6f23deb92b466802e3952443722e23