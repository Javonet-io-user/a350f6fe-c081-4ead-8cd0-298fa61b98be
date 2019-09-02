package RDPCrystalEDILibrary;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;

public class ExtCodeList {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static Dictionary<java.lang.String, CodeList> getExternalCodeLists() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.ExtCodeList").<NObject>get("ExternalCodeLists");
      if (res == null) return null;
      return new Dictionary<java.lang.String, CodeList>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setExternalCodeLists(Dictionary<java.lang.String, CodeList> param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.ExtCodeList").set("ExternalCodeLists", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ContainsList(java.lang.String name) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RDPCrystalEDILibrary.ExtCodeList").invoke("ContainsList", name);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean ContainsListAndValue(
      java.lang.String name, java.lang.String value) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RDPCrystalEDILibrary.ExtCodeList")
              .invoke("ContainsListAndValue", name, value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
