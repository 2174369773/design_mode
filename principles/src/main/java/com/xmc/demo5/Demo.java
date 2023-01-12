package com.xmc.demo5;

/**
 * 迪米特法则就是如果两个软件实体无需直接通信，
 * 可以通过第三方转发该调用，降低耦合度
 */
public class Demo {

    public static void main(String[] args) {

        Agent agent = new Agent();
        Star star = new Star("赵丽颖");
        Fans fans = new Fans("张小明");
        Company company = new Company("虎牙公司");

        agent.setCompany(company);
        agent.setStar(star);
        agent.setFans(fans);

        agent.meeting();
        agent.business();

    }
}
