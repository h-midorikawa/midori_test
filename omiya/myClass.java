public class myClass {

    private myClass instance ;

    myClass(){

        // コンストラクタ

    }

    public static getInstance() {

        if( this.instance == null ) {
            this.instance = new myClass();
        }
        
        return this.instance;
    }
}

