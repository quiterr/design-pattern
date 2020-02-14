package com.quiterr.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangchen
 * @date 2019/11/1
 */
class EstateMedium implements Medium
{
    private List<AbstractCustomer> members=new ArrayList<>();

    @Override
    public void register(AbstractCustomer member)
    {
        if(!members.contains(member))
        {
            members.add(member);
            member.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad)
    {
        for(AbstractCustomer ob:members)
        {
            String name=ob.getName();
            if(!name.equals(from))
            {
                ob.receive(from,ad);
            }
        }
    }
}
