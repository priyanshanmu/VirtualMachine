package cpu;

import device.Bus;

public interface Cpu {
	/**
	 * Attaches the given bus to the cpu.
	 * @param bus
	 */
	public void setBus(Bus bus);
	
	public void reset();
	public void step() throws NoBusSetException;
	
	/**
	 * Starts the execution of the program.
	 * 
	 * The first instruction of the program is assumed
	 * to be found on the address 0 of the attached bus.
	 * @throws NoBusSetException If no bus has been previously set
	 */
	public void run() throws NoBusSetException;
}
