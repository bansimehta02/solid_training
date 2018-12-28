package com.meditab.training.dip.exercise;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        file encodingfile = new file();
        nw encodingnw = new nw();
        encodingfile.encode();
        encodingnw.encode();
    }
}
