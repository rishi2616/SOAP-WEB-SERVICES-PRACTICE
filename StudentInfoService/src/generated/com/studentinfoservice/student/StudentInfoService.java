package com.studentinfoservice.student;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-01-30T12:40:47.982-06:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://studentInfoService.com/Student", name = "StudentInfoService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StudentInfoService {

    @WebMethod
    @WebResult(name = "ResponseForStudentInfo", targetNamespace = "http://studentInfoService.com/Student", partName = "parameters")
    public StudentResponse getStudentDetails(
        @WebParam(partName = "parameters", name = "RequestForStudentInfo", targetNamespace = "http://studentInfoService.com/Student")
        StudentRequest parameters
    );
}
