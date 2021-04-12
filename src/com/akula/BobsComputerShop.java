package com.akula;

abstract class BobsComuterShop implements BobsShop{

    public abstract Double commissionRate(Double sales);

    public void salesPersonsPay(double advance,double rate) {};
}


