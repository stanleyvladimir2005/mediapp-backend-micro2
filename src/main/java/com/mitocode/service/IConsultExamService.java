package com.mitocode.service;

import com.mitocode.model.ConsultExam;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface IConsultExamService {

	List<ConsultExam> getExamsByConsult(@Param("idConsult") Integer idConsult);
}