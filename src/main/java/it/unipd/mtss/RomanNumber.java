////////////////////////////////////////
// Matteo Wu 2075514
// Ana Maria Draghici 2101044
////////////////////////////////////////
package it.unipd.mtss;

public class RomanNumber {
      /**
         _____  __      __ __   __  _         _____   _____    __  __ 
        |_   _| \ \    / / \ \ / / | |       / ____| |  __ \  |  \/  |
          | |    \ \  / /   \ V /  | |      | |      | |  | | | \  / |
          | |     \ \/ /     > <   | |      | |      | |  | | | |\/| |
         _| |_     \  /     / . \  | |____  | |____  | |__| | | |  | |
        |_____|     \/     /_/ \_\ |______|  \_____| |_____/  |_|  |_|
     */
    public final static int lineHeight = 6;

    public final static String[] I = {" _____ ",
                                      "|_   _|",
                                      "  | |  ", 
                                      "  | |  ",
                                      " _| |_ ",
                                      "|_____|" };

    public final static String[] V = {"__      __",
                                      "\\ \\    / /",
                                      " \\ \\  / / ",
                                      "  \\ \\/ /  ",
                                      "   \\  /   ",
                                      "    \\/    "};

    public final static String[] X = {"__   __",
                                      "\\ \\ / /",
                                      " \\ V / ",
                                      "  > <  ",
                                      " / . \\ ",
                                      "/_/ \\_\\"};

    public final static String[] L = {" _      ",
                                      "| |     ",
                                      "| |     ",
                                      "| |     ",
                                      "| |____ ",
                                      "|______|"};
                         
    public final static String[] C =  {"  _____ ",
                                       " / ____|",
                                       "| |     ",
                                       "| |     ",
                                       "| |____ ",
                                       " \\_____|"};

    public final static String[] D = {" _____  ",
                                      "|  __ \\ ",
                                      "| |  | |",
                                      "| |  | |",
                                      "| |__| |",
                                      "|_____/ "};

    public final static String[] M = {" __  __ ",
                                      "|  \\/  |",
                                      "| \\  / |",
                                      "| |\\/| |",
                                      "| |  | |",
                                      "|_|  |_|"};
}