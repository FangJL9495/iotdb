package org.apache.iotdb.cluster.query.distribution.plan.process;

import org.apache.iotdb.cluster.query.distribution.common.WithoutPolicy;
import org.apache.iotdb.cluster.query.distribution.plan.PlanNodeId;

/**
 * WithoutNode is used to discard specific rows from upstream node.
 */
public class WithoutNode extends ProcessNode {

    // The policy to discard the result from upstream operator
    private WithoutPolicy discardPolicy;

    public WithoutNode(PlanNodeId id) {
        super(id);
    }

    public WithoutNode(PlanNodeId id, WithoutPolicy discardPolicy) {
        this(id);
        this.discardPolicy = discardPolicy;
    }
}