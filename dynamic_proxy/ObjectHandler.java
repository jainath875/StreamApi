package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ObjectHandler implements InvocationHandler{

    private Object target;

    public ObjectHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().contains("put")) {

            if (args[0].equals("java")) {

                System.out.println("Cannot insert key 'java'");
                return null;
                
            }
            
        }

        //logic before method call
        // System.out.println("Before method: call");
        Object invoke = method.invoke(target, args);

        //logic after method call();
        // System.out.println("After method: call" );
        return invoke;

    }
    
}
