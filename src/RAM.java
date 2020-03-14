// Copyright © 2020 Jongmin Han. All rights reserved.
// No part of this code may be reproduced or used in any manner
// without written permission of the copyright owner.

// 64KB RAM
public class RAM
{
    private Line[] mMemory;

    public RAM()
    {
        mMemory = new Line[65_536];
    }

    public void WriteMode(int address, eCommand command, byte data)
    {
        mMemory[address] = new Line(command, data);
    }

    public void WriteMode(int address, eCommand command)
    {
        mMemory[address] = new Line(command);
    }

    public Line ReadMode(int address)
    {
        return mMemory[address];
    }
}
