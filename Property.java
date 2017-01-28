package calopoly;
/** A Calopoly property.
 *  @author Amir Shahatit
 */
class Property {
    /**
     * Constructor for a new property.
     * @param name Name of property.
     * @param isEdge If the property is an edge property
     *               ie. BoardWalk. Rent is higher and cost is higher.
     * @param spot Area on board the property will represent.
     *             Determines price and rent because location location location.
     * @return a property with the quantites held by inputs.
     */
    Property property(int spot) {
        _spot = spot;
        _color = getColor(spot);
        _isEdge = new boolean[40];
        _isEdge[3] = true;
        for (int i = 0; i < 4; i++) {
            _isEdge[i * 10 + 4] = true;
            _isEdge[i * 10 + 9] = true;
        }
    }
    private int getColor(int spot) {

    }
    void set_Name(string title) {
        _name = title;
    }
    /**Property's name.*/
    String _name;

    /**Cost to buy this property.*/
    int _val;

    /**Spot on board it will occupy.*/
    int _spot;

    /**Properties on the classic board.
     * Oski's Corner Gold
     * Campanile = BoardWalk
     * Big C = park place
     * Asian Ghetto Blue
     * KingPin, Gypsies, Steves
//     * Another group could be
//     * Artichoke, Top Dog, La Burrita
     * get out of jail free = circle of legal freedom thing.
     * kipps, freehouse, taphaus
     * frats
     * sororities
     * Rsf, Memorial gym
     * you passed sather
     * Athlete Starter pack purple
     * Memorial Stadium, Media Studies, GBC/CKC?
     * CS Starter pack brown in begining
     * Denero, Soda, cog sci
     * Enviro starter pack
     * Vegan cinnamon roll place, VLSB?, Strawberry Creek.
     * Haas
     * econ, ...?
     * Railroads?
     * Croads = reading Railway
     * Cafe 3 = penn
     * foothill = b and r
     * ckc = shortline
     * */

    /**Color of property on board numbered 0 - 9. 0-1 southside properties
     * 2-3 westside, 4-5 northside, 6-7 east side 8 railroad, 9 utility.*/
    int color;
    /**Shows wheter the property at the index of the board is an edge deserving
     * greater rent and value*/
    boolean[] _isEdge
}