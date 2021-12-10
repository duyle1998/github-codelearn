package Huongdt;



abstract class TwoDshape {
    private int a;
    abstract  int b(int c);



    public TwoDshape(int a) {
        this.a = a;
    }

}
class oMo extends TwoDshape{

    @Override
   int b(int c) {
        return 0;
    }

    public oMo(int a) {
        super(a);
    }


}