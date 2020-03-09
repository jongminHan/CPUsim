// Copyright © 2020 Jongmin Han. All rights reserved.
// No part of this code may be reproduced or used in any manner
// without written permission of the copyright owner.

// 64KB RAM
public class RAM
{
    private byte[] mMemory;

    public RAM()
    {
        mMemory = new byte[65_536];
    }

    public void WriteMode(int address, byte input)
    {
        mMemory[address] = input;
    }

    public int ReadMode(int address)
    {
        return mMemory[address] & 0xFF;
    }
}
