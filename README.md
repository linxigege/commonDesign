# commonDesign
今天看到傅老大开了新打卡，作为今年唯一的一次作业，我苦思冥想，想到一个设经典计案例拿来交作业，我想大家不管在工作中还是傅哥的项目中，都能看到它的身影。首先说说场景、目标。
首先嘛，项目中有很多服务，每个服务的业务数据在进行保存入库的时候他们的id需求呀，或者啥充当编号的 都会不一样。 然后我们的目的的就是做出一套id、编号…服务出来 它呢就能根据不同的业务拿到它们定制化的id编号，如果是标准的。很普通的一些业务就拿走一些默认的id编号生成流程呗。然后俺贴出这个场景下的设计，大家可以留言说说其中用到了哪些设计，巧妙之处在哪，说的好奖一朵小红花哈哈哈。

这个例子也比较简单，我也不做多解释，直接上代码，非核心部分就省略字数了，首先：先创建一个简单的springboot-web项目
先来定义一个接口
```
public interface IdGenerator {

    /**
     * 业务码
     *
     * @return
     */
    String businessCode();

    /**
     * 获取业务id
     *
     * @return
     */
    String getId();
}
```
再来一个默认实现
```
abstract class IdGeneratorHandler implements IdGenerator {

    /**
     * 业务码
     *
     * @return
     */
    @Override
    public abstract String businessCode();

    /**
     * 获取业务id
     *
     * @return
     */
    @Override
    public String getId() {
        // return UUid
        beforeGetId(businessCode());
        String returnId = UUID.randomUUID().toString().replace("-", "");
        afterGetId(returnId);
        return returnId;
    }

    /**
     * 在获取id前我可能有些想法
     */
    protected void beforeGetId(String code) {

    }

    /**
     * 获取完id之后我可能还有些想法
     */
    protected void afterGetId(String returnId) {

    }
}
```
再来几个个性化实现
```
public class LogIdGeneratorHandler  extends IdGeneratorHandler {
...  非核心不做过多展示
}
```
public class OrderIdGeneratorHandler  extends IdGeneratorHandler {
...  非核心不做过多展示
}
```
再来一个工厂包装下，嘿嘿
```
...内容超纲了，这里贴个外链：https://articles.zsxq.com/id_l2038f7b9p0z.html
