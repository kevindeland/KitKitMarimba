package com.enuma.marimba.song;

/**
 * marimba
 * <p>
 * Created by kevindeland on 2019-09-23.
 */
public class Song {

    public Note[] _notes;
    public int _numNotes;

    public Song(int[] notes, long[] times) throws Exception {
        if (notes.length != times.length) throw new Exception("Must have same number in each");
        _numNotes = notes.length;

        _notes = new Note[_numNotes];
        for (int i=0; i < notes.length; i++) {

            _notes[i] = new Note(notes[i], times[i]);
        }
    }

    public class Note {

        public int _note;
        public long _time;

        Note(int note, long time) {
            this._note = note;
            this._time = time;
        }
    }
}
