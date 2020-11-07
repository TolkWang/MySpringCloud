package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangtao
 * @date 2020/6/29 17:43
 * @desc
 */

@Component
public class MyLB implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        while (true) {
            int current = this.atomicInteger.get();
            int next = current >= 2147483647?0:current+1;
            if(this.atomicInteger.compareAndSet(current,next)) {
                return next;
            }
        }
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = atomicInteger.getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
