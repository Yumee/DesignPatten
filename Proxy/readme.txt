代理模式：分为静态代理和动态代理。
静态代理：一般指定特定的代理对象，在程序运行前就已经确定好要代理的类或对象
动态代理：程序运行时动态的进行代理。分为Java 原生代理和CGLib动态代理
Java原生代理：代理类需要实现 InvocationHandler 接口，重载 invoke 方法，
    通过调用（1）method.invoke(this.proxy,args)去调用被代理类的具体方法
CGLib动态代理：需要导入CGLib包，代理类需要实现MethodInterceptor接口，
    重载intercept函数，通过调用（2）methodProxy.invokeSuper(o,objects)去掉用被代理类的方法


原生的动态代理只能代理接口，不能代理继承类
CGLib全部能代理，而且（2）的效率要比（1）高 50%左右

动态代理应用于Spring框架中的AOP，能够控制日志输出，权限拦截，
默认是使用原生动态代理技术，当代理类没有接口启用CGLib代理