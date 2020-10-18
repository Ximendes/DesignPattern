package com.design_pattern.chain_of_responsability_internet;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}
