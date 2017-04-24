package com.ksc.network.vpc.transform.VpcPeeringConnection;

import javax.xml.stream.events.XMLEvent;

import com.ksc.network.vpc.model.VpcPeeringConnection.AccepterVpcInfo;
import com.ksc.network.vpc.model.VpcPeeringConnection.RequesterVpcInfo;
import com.ksc.transform.SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller;
import com.ksc.transform.StaxUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

/**
 * SecurityGroupRule StAX Unmarshaller
 */
public class AccepterVpcInfoStaxUnmarshaller implements Unmarshaller<AccepterVpcInfo, StaxUnmarshallerContext> {

	public AccepterVpcInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
		AccepterVpcInfo vpcInfo = new AccepterVpcInfo();
		int originalDepth = context.getCurrentDepth();
		int targetDepth = originalDepth + 1;

		if (context.isStartOfDocument())
			targetDepth += 1;
		
		while (true) {
			XMLEvent xmlEvent = context.nextEvent();
			if (xmlEvent.isEndDocument())
				return vpcInfo;
			if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

				if (context.testExpression("AccountId", targetDepth)) {
					vpcInfo.setAccountId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("Region", targetDepth)) {
					vpcInfo.setRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcId", targetDepth)) {
					vpcInfo.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcName", targetDepth)) {
					vpcInfo.setVpcName(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("CidrBlock", targetDepth)) {
					vpcInfo.setCidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

				if (context.testExpression("VpcPeeringConnectionId", targetDepth)) {
					vpcInfo.setVpcPeeringConnectionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
					continue;
				}

			} else if (xmlEvent.isEndElement()) {
				if (context.getCurrentDepth() < originalDepth) {
					return vpcInfo;
				}
			}
		}
	}

	private static AccepterVpcInfoStaxUnmarshaller instance;

	public static AccepterVpcInfoStaxUnmarshaller getInstance() {
		if (instance == null)
			instance = new AccepterVpcInfoStaxUnmarshaller();
		return instance;
	}
}
