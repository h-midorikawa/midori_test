public class myClass {

    private myClass instance_ ;

    myClass(){

        // コンストラクタ

    }

    public static getInstance() {

        if( instance_ == null ) {
            instance_ = new myClass();
        }
        
        return instance_;
    }
}

