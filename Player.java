package calopoly;
/** A Calopoly Player.
 *  @author Amir Shahatit
 */
class Player {

    /** A Player that will play MYCOLOR in GAME. */
    Player(Game game, GamePiece piece) {
        _game = game;
        _myPiece = piece;
        _position = 0;
        _myMoola = 1500;
        _jailed = false;
    }

    /** Return my pieces' character. */
    GamePiece myPiece() {
        return _myPiece;
    }

    /** Return the game I am playing in. */
    Game game() {
        return _game;
    }

    /** Return a view of the board I am playing on. */
    Board board() {
        return _game.board();
    }

    /**@return Whether a player has been in jail for more than 3 turns.*/
    boolean jailTime() {
        return _jailTime < 3;
    }

    /**@return Whether the player has been Jailed. */
    boolean jailed() {
        return _jailed;
    }
    /** Adds money to players bank.
     * @param money amount to be added to bank.
     */
    void add(int money) {
        _myMoola += money;
    }

    /**Changes the players attributes given a move in the game */
    void makeMove(Move move) {
        if (jailed()) {
            if (!jailTime()) {
//                prompt user to roll for doubles or pay and return result of
//                rolling for doubles.
                boolean paid = userPrompt();
                if (!paid) {
                    boolean doubles = userPrompt();
                    if (doubles) {
                        if(_game.rollForDoubles()) {
                            _jailed = false;
                            _jailTime = 0;
                        }
                    }
                }
                _jailTime++;
            } else {
               add(-50);
                _jailed = false;
                _jailTime = 0;
            }
        }
        if (!jailed()) {
            int square = move.curr();
            _position = square;
//        notify();
            if (move.passed()) {
                add(200);
//            notify()
            }
            Card card = board().card(square);
            if (card != null) {
                card.action(this._myPiece);
                //            notify()
            } else if (board().jail(square)) {
                _jailed = true;
                //            notify()
            } else {
                GamePiece currOwner = board().owner(square);
                if (currOwner != null) {
                    int money = board().rent(square);
                    add(-(money));
                    game().getPlayer(currOwner).add(money);
                } else {
                    boolean bought = _game.buy(_myPiece);
                    if (bought) {
                        add(-(board().price(square)));
                    }
                }
            }
        }
//        notify();
    }

    /** The game I am playing in. */
    private final Game _game;

    /** The color of my pieces. */
    private final GamePiece _myPiece;

    /** Where the player is on the board.*/
    private int _position;

    /**Keeps track of players money.*/
    private int _myMoola;

    /**Keeps track of whether a player is in jail or not.*/
    private boolean _jailed;

    /**Keeps track of how many turns a player has been in jail.*/
    private int _jailTime;
}
