/*
* Copyright (c) 2000 jPOS.org.  All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions
* are met:
*
* 1. Redistributions of source code must retain the above copyright
*    notice, this list of conditions and the following disclaimer.
*
* 2. Redistributions in binary form must reproduce the above copyright
*    notice, this list of conditions and the following disclaimer in
*    the documentation and/or other materials provided with the
*    distribution.
*
* 3. The end-user documentation included with the redistribution,
*    if any, must include the following acknowledgment:
*    "This product includes software developed by the jPOS project
*    (http://www.jpos.org/)". Alternately, this acknowledgment may
*    appear in the software itself, if and wherever such third-party
*    acknowledgments normally appear.
*
* 4. The names "jPOS" and "jPOS.org" must not be used to endorse
*    or promote products derived from this software without prior
*    written permission. For written permission, please contact
*    license@jpos.org.
*
* 5. Products derived from this software may not be called "jPOS",
*    nor may "jPOS" appear in their name, without prior written
*    permission of the jPOS project.
*
* THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
* OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
* IN NO EVENT SHALL THE JPOS PROJECT OR ITS CONTRIBUTORS BE LIABLE FOR
* ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
* OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
* HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
* STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
* IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
* POSSIBILITY OF SUCH DAMAGE.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the jPOS Project.  For more
* information please see <http://www.jpos.org/>.
*/

package vaulsys.protocols.PaymentSchemes.ISO8583.base;


import vaulsys.protocols.PaymentSchemes.ISO8583.base.*;
import vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOException;
import vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOField;
import vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOUtil;
import vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOVError;
import vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOVField;

/**
 * Validator for ASCII alphanumeric fields.
 * <p/>
 * <p>Title: jPOS</p>
 * <p>Description: Java Framework for Financial Systems</p>
 * <p>Copyright: Copyright (c) 2000 jPOS.org.  All rights reserved.</p>
 * <p>Company: www.jPOS.org</p>
 *
 * @author Jose Eduardo Leon
 * @version 1.0
 */
public class IVA_ALPHANUMSPEC extends ISOFieldValidator {

    public IVA_ALPHANUMSPEC() {
        super();
    }

    public IVA_ALPHANUMSPEC(String Description) {
        super(Description);
    }

    public IVA_ALPHANUMSPEC(int minLen, int maxLen, String Description) {
        super(minLen, maxLen, Description);
    }

    public IVA_ALPHANUMSPEC(int maxLen, String Description) {
        super(maxLen, Description);
    }

    public IVA_ALPHANUMSPEC(boolean breakOnError, String Description) {
        this(Description);
        this.breakOnError = breakOnError;
    }

    public IVA_ALPHANUMSPEC(boolean breakOnError, int maxLen, String Description) {
        this(maxLen, Description);
        this.breakOnError = breakOnError;
    }

    public IVA_ALPHANUMSPEC(boolean breakOnError, int minLen, int maxLen, String Description) {
        this(minLen, maxLen, Description);
        this.breakOnError = breakOnError;
    }

    /**
     * Validate that component has alphanumericspecial value.
     *
     * @see vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOUtil#isAlphaNumeric method
     */
    public vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOComponent validate(vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOComponent f) throws ISOException {
        vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOField c = (vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOField) f;
        try {
            /** length validation **/
            c = (ISOField) super.validate(c);
            /** alphanum validations **/
            if (!ISOUtil.isAlphaNumericSpecial((String) c.getValue())) {
                vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOVError e = new vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOVError("Invalid Value Error. " + (String) c.getValue() + " is not an alphanumeric value. ", getRejCode(ISOVError.ERR_INVALID_VALUE));
                if (c instanceof vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOVField)
                    ((vaulsys.protocols.PaymentSchemes.ISO8583.base.ISOVField) c).addISOVError(e);
                else
                    c = new ISOVField(c, e);
                if (breakOnError)
                    throw new ISOVException("Error on field " + ((Integer) c.getKey()).intValue(), c);
            }
            return c;
        }
        catch (Exception ex) {
            if (ex instanceof ISOVException) throw (ISOVException) ex;
            return c;
        }
    }
}