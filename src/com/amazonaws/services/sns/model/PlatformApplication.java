/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sns.model;
import java.io.Serializable;

/**
 * 
 */
public class PlatformApplication  implements Serializable  {

    /**
     * 
     */
    private String platformApplicationArn;

    /**
     * 
     */
    private java.util.Map<String,String> attributes;

    /**
     * 
     *
     * @return 
     */
    public String getPlatformApplicationArn() {
        return platformApplicationArn;
    }
    
    /**
     * 
     *
     * @param platformApplicationArn 
     */
    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platformApplicationArn 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PlatformApplication withPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;

    }
    
    /**
     * 
     *
     * @param attributes 
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PlatformApplication withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPlatformApplicationArn() != null) sb.append("PlatformApplicationArn: " + getPlatformApplicationArn() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPlatformApplicationArn() == null) ? 0 : getPlatformApplicationArn().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PlatformApplication == false) return false;
        PlatformApplication other = (PlatformApplication)obj;
        
        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null) return false;
        if (other.getPlatformApplicationArn() != null && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    