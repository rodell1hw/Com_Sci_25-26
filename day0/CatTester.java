public class CatTester {
    //for (let i = 0; i < 3; i++) {
        //console.log("Iteration number: " + i);
    //}
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getCatChar();
        cat.getCatId();
        cat.getClass();
        cat.isHungry();
        cat.setHungry(false);
        Cat bill = new Cat();
        bill.getCatChar();
        bill.getCatId();
        bill.getClass();
        bill.isHungry();
        bill.setHungry(false);
        cat.equals(bill);
        PurrfectUtils.bootUp(cat);
        PurrfectUtils.pet(cat);
        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(bill);
        }
        PurrfectUtils.feed(cat);
        PurrfectUtils.cleanLitterBox(cat);
        System.out.println(PurrfectUtils.generateRandomNumber(1000, 9999));
        System.out.println(PurrfectUtils.validateCatId("1234"));

    }
}
