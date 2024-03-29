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

public abstract class TypedDocument {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDestroySegmentsAfter(java.lang.Boolean value) {
    try {
      javonetHandle.set("DestroySegmentsAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDestroySegmentsAfter() {
    try {
      java.lang.Boolean res = javonetHandle.get("DestroySegmentsAfter");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoPlaceCorrectNumOfSegments(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceCorrectNumOfSegments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoPlaceCorrectNumOfSegments() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoPlaceCorrectNumOfSegments");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoPlaceNumOfTransactions(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceNumOfTransactions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoPlaceNumOfTransactions() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoPlaceNumOfTransactions");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoPlaceNumOfFunctionalGroups(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoPlaceNumOfFunctionalGroups", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoPlaceNumOfFunctionalGroups() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoPlaceNumOfFunctionalGroups");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPadISAElementValues(java.lang.Boolean value) {
    try {
      javonetHandle.set("PadISAElementValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPadISAElementValues() {
    try {
      java.lang.Boolean res = javonetHandle.get("PadISAElementValues");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMainSection(DocumentLoop value) {
    try {
      javonetHandle.set("MainSection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DocumentLoop getMainSection() {
    try {
      Object res = javonetHandle.<NObject>get("MainSection");
      if (res == null) return null;
      return new DocumentLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TypedDocument() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.TypedDocument");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TypedDocument(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToEDIString(WriteArguments args) {
    try {
      java.lang.String res = javonetHandle.invoke("ToEDIString", args);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToEDIString(Delimiters delimiters) {
    try {
      java.lang.String res = javonetHandle.invoke("ToEDIString", delimiters);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GenerateEDIFile(Delimiters delimiters, java.lang.String file) {
    try {
      javonetHandle.invoke("GenerateEDIFile", delimiters, file);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GenerateEDIFile(WriteArguments writeArguments, java.lang.String file) {
    try {
      javonetHandle.invoke("GenerateEDIFile", writeArguments, file);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Load(EDILightWeightDocument lightWeightDocument) {
    try {
      javonetHandle.invoke("Load", lightWeightDocument);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
