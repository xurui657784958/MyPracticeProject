package util;

import java.util.Objects;
/**
 * ngw v5.0
 */

public class VxlanRouteConfig implements IDeviceConfig {

    // routeTable enum
    public static final Integer TABLE_DEFAULT = 0;
    public static final Integer TABLE_SRCIP = 1;
    // description enum
    public static final Integer DESC_FCR_ROUTE = 10000;
    public static final Integer DESC_BGP_PEER_ROUTE = 10001;
    // weight default value
    public static Integer WEIGHT_DEFAULT = 5;
    private String vrfName;
    private String peerId;
    private Integer vni;
    private String prefix;
    private String remoteVtepIp;
    private Integer dscp;
    private Integer weight;
    private String exitInterface;
    private String gateway;
    private String srcIp;
    private Integer routeTable;
    private Integer description;

    public VxlanRouteConfig(String vrfName, String peerId, Integer vni, String prefix, String remoteVtepIp,
            Integer dscp, Integer weight, String exitInterface, String gateway, String srcIp,
            Integer routeTable, Integer description) {
        this.vrfName = vrfName;
        this.peerId = peerId;
        this.vni = vni;
        this.prefix = prefix;
        this.remoteVtepIp = remoteVtepIp;
        this.dscp = dscp;
        this.weight = weight;
        this.exitInterface = exitInterface;
        this.gateway = gateway;
        this.srcIp = srcIp;
        this.routeTable = routeTable;
        this.description = description;
    }

   /* public static void main(String[] args) {
        System.out.println(true);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VxlanRouteConfig that = (VxlanRouteConfig) o;
        return Objects.equals(vrfName, that.vrfName)
                && Objects.equals(peerId, that.peerId)
                && Objects.equals(vni, that.vni)
                && Objects.equals(prefix, that.prefix)
                && Objects.equals(remoteVtepIp, that.remoteVtepIp)
                && Objects.equals(dscp, that.dscp)
                && Objects.equals(weight, that.weight)
                && Objects.equals(exitInterface, that.exitInterface)
                && Objects.equals(gateway, that.gateway)
                && Objects.equals(srcIp, that.srcIp)
                && Objects.equals(routeTable, that.routeTable)
                && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vrfName, peerId, vni, prefix, remoteVtepIp, dscp, weight, exitInterface,
                gateway, srcIp, routeTable, description);
    }

    @Override
    public String spliceConfObjId() {
        return null;
    }

    @Override
    public String generateConfCliDesc() {
        return null;
    }
}
