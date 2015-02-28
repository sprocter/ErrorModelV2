package org.osate.xtext.aadl2.errormodel.util;

import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation;

/**
 * Directional propagation path
 *
 * @author phf
 *
 */
public class PropagationPathRecord {
	PropagationPathEnd pathSrc;
	PropagationPathEnd pathDst;
	ConnectionInstance conni;

	public PropagationPathRecord(ComponentInstance srcCI, ErrorPropagation srcEP, ComponentInstance dstCI,
			ErrorPropagation dstEP, ConnectionInstance conni) {
		pathSrc = new PropagationPathEnd(srcCI, srcEP);
		pathDst = new PropagationPathEnd(dstCI, dstEP);
		this.conni = conni;
	}

	public PropagationPathRecord(ComponentInstance srcCI, ErrorPropagation srcEP, ComponentInstance dstCI,
			ErrorPropagation dstEP) {
		pathSrc = new PropagationPathEnd(srcCI, srcEP);
		pathDst = new PropagationPathEnd(dstCI, dstEP);
		conni = null;
	}

	public PropagationPathRecord(ConnectionInstance srcConni, ComponentInstance dstCI, ErrorPropagation dstEP) {
		pathSrc = new PropagationPathEnd(srcConni, null);
		pathDst = new PropagationPathEnd(dstCI, dstEP);
		conni = null;
	}

	public PropagationPathRecord(ComponentInstance srcCI, ErrorPropagation srcEP, ConnectionInstance dstConni) {
		pathSrc = new PropagationPathEnd(srcCI, srcEP);
		pathDst = new PropagationPathEnd(dstConni, null);
		conni = null;
	}

	public ConnectionInstance getConnectionInstance() {
		return conni;
	}

	public PropagationPathEnd getPathSrc() {
		return pathSrc;
	}

	public ComponentInstance getSrcCI() {
		return pathSrc.getComponentInstance();
	}

	public ConnectionInstance getSrcConni() {
		return pathSrc.getConnectionInstance();
	}

	public void setPathSrc(PropagationPathEnd pathSrc) {
		this.pathSrc = pathSrc;
	}

	public PropagationPathEnd getPathDst() {
		return pathDst;
	}

	public ComponentInstance getDstCI() {
		return pathDst.getComponentInstance();
	}

	public ConnectionInstance getDstConni() {
		return pathDst.getConnectionInstance();
	}

	public void setPathDst(PropagationPathEnd pathDst) {
		this.pathDst = pathDst;
	}
}
