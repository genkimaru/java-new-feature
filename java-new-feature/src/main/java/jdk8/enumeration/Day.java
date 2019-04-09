package jdk8.enumeration;

/**
 * @auther guan.c.wang
 * @date 4/9/2019.
 * @see
 */
public enum Day {

    Monday {
        @Override
        void plan() {
                System.out.println(" do " + this.name() +" work");
        }
    } ,
    Tuesday {
        @Override
        void plan() {
            System.out.println(" do " + this.name() +" work");
        }
    },
    Wendesday {
        @Override
        void plan() {
            System.out.println(" do " + this.name() +" work");
        }
    },
    Thusday {
        @Override
        void plan() {
            System.out.println(" do " + this.name() +" work");
        }
    }
    ,
    Friday {
        @Override
        void plan() {
            System.out.println(" do " + this.name() +" work");
        }
    } ,
    Satusday {
        @Override
        void plan() {
            System.out.println(" do " + this.name() +" work");
        }
    },
    Sunday {
        @Override
        void plan() {
            System.out.println(" do " + this.name() +" work");
        }
    };

    abstract void plan();

    public static void main(String[] args){
        Day.Monday.plan();
        Day.Tuesday.plan();
        Day.Wendesday.plan();
    }
}

