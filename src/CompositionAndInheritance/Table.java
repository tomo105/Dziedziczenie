package CompositionAndInheritance;

 class Table extends Custom {
    private Spoon spoon;
    private DinnerPlate dinnerPlate;

     Table(int i) {
        super(i + 1);
        this.spoon = new Spoon(i + 2);
        this.dinnerPlate = new DinnerPlate(i + 3);
        System.out.println("constructor Table");
    }
}
