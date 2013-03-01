package com.github.samuelbr.ZK1584;

import java.util.List;

import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.util.ExecutionCleanup;
import org.zkoss.zk.ui.util.ExecutionInit;

public class DemoListener implements ExecutionCleanup, ExecutionInit {

	@Override
	public void init(Execution exec, Execution parent) throws Exception {
		if (parent == null) {
			System.out.println("INIT");
		}
	}

	@Override
	public void cleanup(Execution exec, Execution parent, List<Throwable> errs)
			throws Exception {

		if (parent == null) {
			System.out.println("CLEANUP");
		}
		
	}

}
