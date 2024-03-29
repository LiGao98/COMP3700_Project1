package com.company;

public class CustomerModel {
    public int mCustomerID;
    public String mName, mAddress, mPhone;

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.mCustomerID).append(",");
        sb.append("\"").append(this.mName).append("\"").append(",");
        sb.append("\"").append(this.mPhone).append("\",");
        sb.append("\"").append(this.mAddress).append("\")");
        return sb.toString();
    }
}
