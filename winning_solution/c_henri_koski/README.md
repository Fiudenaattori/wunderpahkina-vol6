Hi,

This program uses GNU mmap function from sys/mman.h so it won't run on windows.
Linux, mac os and bsd systems should be ok.
Compile it with gcc using -Ofast flag.

Usage:
gcc w6.c -o w6 -Ofast
./w6 input.txt

Read the comments in source for more info.
Thanks for nice puzzle =)

Henri Koski
