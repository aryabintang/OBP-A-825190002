public class Rectangle {
    //atribut class
        public double leghth,width,luaspersegi,kelilimh;

        //construktor default
        public  Rectangle(){
            leghth = 1.0;
            width = 1.0;
        }

        //constructor parameter
        public Rectangle(double w, double l){
            leghth =l;
            width =w;
        }

        public void  setLeghth(double leghth){     //settter leght
            this.leghth=leghth;
        }

        public  double getLeghth(){     // getter leght
            return  leghth;
        }

        public void  setWidth(double width){      //settter Width
            this.width = width;
        }

        public double getWidth(){        // getter width
            return width ;
        }

       public double luaspersegi(){
            return  width * leghth;
       }

      public double kelilimh(){
            return  2 * (width + leghth) ;
       }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leghth=?" + leghth +
                ", width=? " + width +
                '}';
    }
}