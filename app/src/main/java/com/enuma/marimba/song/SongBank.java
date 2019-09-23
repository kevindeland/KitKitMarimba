package com.enuma.marimba.song;

/**
 * marimba
 * <p>
 * Created by kevindeland on 2019-09-23.
 */
public class SongBank {

    public static Song PERPETUUM;

    public static Song FUN_THING_1;
    public static Song FUN_THING_2;

    public static Song RUGRATS; // tommy pickles

    static {
        try {
            PERPETUUM = new Song(
                    new int[]{
                            0, 2, 0, 4,
                            0, 5, 7},

                    new long[]{
                            0, 200, 400, 600,
                            800, 1000, 1200}
                    );


            // play these two in succession
            FUN_THING_1 = new Song(
                    new int[] {
                            0, 2, 0, 4
                    },
                    new long[] {
                            0, 160, 320, 480
                    }
            );
            FUN_THING_2 = new Song(
                    new int[] {
                            0, 3, 0, 5
                    },
                    new long[] {
                            0, 160, 320, 480
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
