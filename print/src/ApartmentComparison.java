public class ApartmentComparison {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public ApartmentComparison(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(ApartmentComparison otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        else {
            return  false;
        }
    }

    public int priceDifference(ApartmentComparison otherApartment) {
        return Math.abs(this.pricePerSquareMeter*this.squareMeters - otherApartment.pricePerSquareMeter*otherApartment.squareMeters);
    }

    public boolean moreExpensiveThan(ApartmentComparison otherApartment) {
        if (this.pricePerSquareMeter*this.squareMeters > otherApartment.pricePerSquareMeter*otherApartment.squareMeters) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        ApartmentComparison studioManhattan = new ApartmentComparison(1, 16, 5500);
        ApartmentComparison twoRoomsBrooklyn = new ApartmentComparison(2, 38, 4200);
        ApartmentComparison fourAndKitchenBronx = new ApartmentComparison(3, 78, 2500);

        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true

        System.out.println("-------");

        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400

        System.out.println("-------");

        System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true
    }
}