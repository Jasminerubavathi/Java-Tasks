interface Shapes {
    void input();
    void area();
}

class Circle implements Shapes {
    int r = 0;
    double pi = 3.14, ar = 0;

   // @Override
    public void input(){
        r = 5;
    }

   // @Override
    public void area(){
        ar = pi * r * r;
        System.out.println("Area of circle:" + ar);
    }
}

class Rectangle implements Shapes{
    int l = 0, b = 0;
    double ar;

   // @Override
    public void input(){
        l = 6;
        b = 4;
    }

   // @Override
    public void area(){
        ar = l * b;
        System.out.println("Area of rectangle:" + ar);
    }
}

  class Demo{
    public static void main(String[] args) {
        Rectangle rt = new Rectangle();
        rt.input();
        rt.area();
        Circle cr = new Circle();
        cr.input();
        cr.area();
    }
}
