package com.xworkz.examination.repository;

import com.xworkz.examination.entity.ExaminationEntity;

public interface Examination {
    boolean saveInventoryInfo(ExaminationEntity entity);
    String updateAllDetailsById(ExaminationEntity entity);
    boolean deleteById(int Id);
}
