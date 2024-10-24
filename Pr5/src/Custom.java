public class Custom {
    private Object str;
    private int num;

    public Custom(Object str) {
        this.str = str;
    }

    public Custom(int num) {
        this.num = num;
    }


    public void print(){
        if(str == null){
            System.out.println(num);
            return;
        }else{
            System.out.println(str.toString());
        }
    }
}

class Second {
    @Override
    public String toString() {
        return "второй";
    }public class Custom {
        private Object str;
        private int num;

        public Custom(Object str) {
            this.str = str;
        }

        public Custom(int num) {
            this.num = num;
        }


        public void print(){
            if(str == null){
                System.out.println(num);
                return;
            }else{
                System.out.println(str.toString());
            }
        }
    }

    class Second {
        @Override
        public String toString() {
            return "второй";
        }
    }

    class Fourth {
        @Override
        public String toString() {
            return "четвертый";
        }
    }

    class Sixth {
        @Override
        public String toString() {
            return "шестой";
        }
    }
}

class Fourth {
    @Override
    public String toString() {
        return "четвертый";
    }
}

class Sixth {
    @Override
    public String toString() {
        return "шестой";
    }
}