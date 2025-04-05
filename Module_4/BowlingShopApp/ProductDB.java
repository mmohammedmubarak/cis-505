/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

package Module_4.BowlingShopApp;

public class ProductDB {

    /**
     * Method to create and return the products based on the input code
     * 
     * @param code to select the product code
     * @return instance of Generic Queue with Product type
     */
    public static GenericQueue<Product> getProducts(String code) {
        GenericQueue<Product> products = new GenericQueue<>();

        if (code.equals("b")) {

            // Creating five new ball instances and adding to generic queue
            Ball ball = new Ball();
            ball.setCode("B100");
            ball.setColor("Black and Red");
            ball.setDescription("Black Widow 2.0");
            ball.setPrice(100);
            products.enqueue(ball);

            Ball ball2 = new Ball();
            ball2.setCode("B200");
            ball2.setColor("Blue and Red");
            ball2.setDescription("Axiom Pearl");
            ball2.setPrice(220.22);
            products.enqueue(ball2);

            Ball ball3 = new Ball();
            ball3.setCode("B300");
            ball3.setColor("Pink and Purple");
            ball3.setDescription("Proton Physix");
            ball3.setPrice(133.33);
            products.enqueue(ball3);

            Ball ball4 = new Ball();
            ball4.setCode("B400");
            ball4.setColor("Red and White");
            ball4.setDescription("Force Unleashed");
            ball4.setPrice(204.12);
            products.enqueue(ball4);

            Ball ball5 = new Ball();
            ball5.setCode("B500");
            ball5.setColor("Purple and Green");
            ball5.setDescription("Phase III");
            ball5.setPrice(120);
            products.enqueue(ball5);

        } else if (code.equals("s")) {

            // Creating five new shoe instances and adding to generic queue
            Shoe shoe = new Shoe();
            shoe.setCode("S100");
            shoe.setSize(10.5);
            shoe.setDescription("Men's Ram Black");
            shoe.setPrice(39.99);
            products.enqueue(shoe);

            Shoe shoe2 = new Shoe();
            shoe2.setCode("S200");
            shoe2.setSize(7.0);
            shoe2.setDescription("Women's Rise Black/Hot Pink");
            shoe2.setPrice(39.99);
            products.enqueue(shoe2);

            Shoe shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setSize(6.0);
            shoe3.setDescription("Women's Path Lite Seamless Mesh");
            shoe3.setPrice(54.99);
            products.enqueue(shoe3);

            Shoe shoe4 = new Shoe();
            shoe4.setCode("S400");
            shoe4.setSize(8.5);
            shoe4.setDescription("Men's Tribal White");
            shoe4.setPrice(26.99);
            products.enqueue(shoe4);

            Shoe shoe5 = new Shoe();
            shoe5.setCode("S500");
            shoe5.setSize(3.0);
            shoe5.setDescription("Youth Skull Green/Black");
            shoe5.setPrice(39.99);
            products.enqueue(shoe5);

        } else if (code.equals("a")) {

            // Creating five new bag instances and adding to generic queue
            Bag bag = new Bag();
            bag.setCode("A100");
            bag.setType("Single");
            bag.setDescription("Path Pro Deluxe");
            bag.setPrice(34.99);
            products.enqueue(bag);

            Bag bag2 = new Bag();
            bag2.setCode("A200");
            bag2.setType("Double");
            bag2.setDescription("Prime Roller Black/Royal Blue");
            bag2.setPrice(54.99);
            products.enqueue(bag2);

            Bag bag3 = new Bag();
            bag3.setCode("A300");
            bag3.setType("Triple");
            bag3.setDescription("Silver/Royal Blue");
            bag3.setPrice(74.99);
            products.enqueue(bag3);

        }
        return products;
    } // end getProducts
}
