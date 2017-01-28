package calopoly;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.awt.HeadlessException;

/** The main program for Ataxx.
 *  @author Amir Shahatit
 */
public class Main {

    /** Run Ataxx game.  Use display if ARGS[k] is '--display'. */
    public static void main(String[] args) {
        Game game;
        Board board = new Board();
        game = new Game(board,
                new ReaderSource(new InputStreamReader(System.in),
                        true),
                new TextReporter());
        }
    }
