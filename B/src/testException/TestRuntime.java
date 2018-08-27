package testException;

/**
 *
 */
public class TestRuntime {
    public static void main(String[] args){

        int i =0 ;
        int j = 0;

        try{
            getValue();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(8888);
    }

    public static void getValue(){
        System.out.println(EnumCode.PARAMEXCEPTION.getLabel());

            throw new BusinessException(EnumCode.PARAMEXCEPTION,"abc");




    }
}
