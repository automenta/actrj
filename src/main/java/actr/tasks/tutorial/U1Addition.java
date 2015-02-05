package actr.tasks.tutorial;

import actr.task.*;

import javax.swing.*;

/**
 * Tutorial Unit 1: Addition Task
 * 
 * @author Dario Salvucci
 */
public class U1Addition extends Task
{
	public Result analyze (Task[] tasks, boolean output)
	{
		boolean ok = (getModel().getProcedural().getLastProductionFired().getName().getString().contains("terminate-addition"));
		return new Result ("U1Addition", ok);
	}

//    public static void main(String[] args) {
//        JFrame f = new JFrame("x");
//        f.setContentPane(new U1Addition());
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(800,600);
//        f.setVisible(true);
//
//    }
}
