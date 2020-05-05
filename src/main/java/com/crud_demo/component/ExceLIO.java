package com.crud_demo.component;
import com.crud_demo.entities.Supplier;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.context.support.BeanDefinitionDslKt;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceLIO {

    public static ResponseEntity<byte[]> supplier2Excel(List<Supplier> list) {
        //1. 创建一个 Excel 文档
        HSSFWorkbook workbook = new HSSFWorkbook();
        //2. 创建文档摘要
        workbook.createInformationProperties();
        //3. 获取并配置文档信息
        DocumentSummaryInformation docInfo = workbook.getDocumentSummaryInformation();
        //文档类别
        docInfo.setCategory("供应商信息");
        //文档管理员
        docInfo.setManager("Dahui");
        //设置公司信息
        docInfo.setCompany("www.dahui.org");
        //4. 获取文档摘要信息
        SummaryInformation summInfo = workbook.getSummaryInformation();
        //文档标题
        summInfo.setTitle("供应商信息表");
        //文档作者
        summInfo.setAuthor("Dahui");
        // 文档备注
        summInfo.setComments("本文档由 Dahui 提供");
        //5. 创建样式
        //创建标题行的样式
        HSSFCellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.YELLOW.index);
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        HSSFCellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
        HSSFSheet sheet = workbook.createSheet("供应商信息表");
        //设置列的宽度
        sheet.setColumnWidth(0, 5 * 256);
        sheet.setColumnWidth(1, 12 * 256);
        sheet.setColumnWidth(2, 10 * 256);
        sheet.setColumnWidth(3, 5 * 256);
        sheet.setColumnWidth(4, 12 * 256);
        sheet.setColumnWidth(5, 20 * 256);
        sheet.setColumnWidth(6, 10 * 256);
        sheet.setColumnWidth(7, 10 * 256);
        sheet.setColumnWidth(8, 16 * 256);
        sheet.setColumnWidth(9, 12 * 256);
        sheet.setColumnWidth(10, 15 * 256);
        sheet.setColumnWidth(11, 20 * 256);
        sheet.setColumnWidth(12, 16 * 256);
        sheet.setColumnWidth(13, 14 * 256);
        sheet.setColumnWidth(14, 14 * 256);
        sheet.setColumnWidth(15, 12 * 256);
        sheet.setColumnWidth(16, 8 * 256);
        sheet.setColumnWidth(17, 20 * 256);
        sheet.setColumnWidth(18, 20 * 256);
        sheet.setColumnWidth(19, 15 * 256);
        sheet.setColumnWidth(20, 8 * 256);
        sheet.setColumnWidth(21, 25 * 256);
        sheet.setColumnWidth(22, 14 * 256);
        sheet.setColumnWidth(23, 15 * 256);
        sheet.setColumnWidth(24, 15 * 256);
        //6. 创建标题行
        HSSFRow r0 = sheet.createRow(0);
        HSSFCell c0 = r0.createCell(0);
        c0.setCellValue("id");
        c0.setCellStyle(headerStyle);
        HSSFCell c1 = r0.createCell(1);
        c1.setCellStyle(headerStyle);
        c1.setCellValue("供应商编号");
        HSSFCell c2 = r0.createCell(2);
        c2.setCellStyle(headerStyle);
        c2.setCellValue("供应商编号-私有");
        HSSFCell c3 = r0.createCell(3);
        c3.setCellStyle(headerStyle);
        c3.setCellValue("供应商名称");
        HSSFCell c4 = r0.createCell(4);
        c4.setCellStyle(headerStyle);
        c4.setCellValue("供应商缩写");
        HSSFCell c5 = r0.createCell(5);
        c5.setCellStyle(headerStyle);
        c5.setCellValue("联系人");
        HSSFCell c6 = r0.createCell(6);
        c6.setCellStyle(headerStyle);
        c6.setCellValue("联系人职务");
        HSSFCell c7 = r0.createCell(7);
        c7.setCellStyle(headerStyle);
        c7.setCellValue("联系人性别");
        HSSFCell c8 = r0.createCell(8);
        c8.setCellStyle(headerStyle);
        c8.setCellValue("联系电话");
        HSSFCell c9 = r0.createCell(9);
        c9.setCellStyle(headerStyle);
        c9.setCellValue("联系地址");
        HSSFCell c10 = r0.createCell(10);
        c10.setCellStyle(headerStyle);
        c10.setCellValue("电话号码");
        HSSFCell c11 = r0.createCell(11);
        c11.setCellStyle(headerStyle);
        c11.setCellValue("联系地址");
        HSSFCell c12 = r0.createCell(12);
        c12.setCellStyle(headerStyle);
        c12.setCellValue("期初欠款");
        HSSFCell c13 = r0.createCell(13);
        c13.setCellStyle(headerStyle);
        c13.setCellValue("开户银行");
        HSSFCell c14 = r0.createCell(14);
        c14.setCellStyle(headerStyle);
        c14.setCellValue("银行账号信息");
        HSSFCell c15 = r0.createCell(15);
        c15.setCellStyle(headerStyle);
        c15.setCellValue("微信号");
        HSSFCell c16 = r0.createCell(16);
        c16.setCellStyle(headerStyle);
        c16.setCellValue("单位电话");
        HSSFCell c17 = r0.createCell(17);
        c17.setCellStyle(headerStyle);
        c17.setCellValue("传真");
        HSSFCell c18 = r0.createCell(18);
        c18.setCellStyle(headerStyle);
        c18.setCellValue("邮箱");
        HSSFCell c19 = r0.createCell(19);
        c19.setCellStyle(headerStyle);
        c19.setCellValue("邮编");
        HSSFCell c20 = r0.createCell(20);
        c20.setCellStyle(headerStyle);
        c20.setCellValue("QQ");
        HSSFCell c21 = r0.createCell(21);
        c21.setCellStyle(headerStyle);
        c21.setCellValue("备注");
        HSSFCell c22 = r0.createCell(22);
        c22.setCellStyle(headerStyle);
        c22.setCellValue("状态");
        HSSFCell c23 = r0.createCell(23);
        c23.setCellStyle(headerStyle);
        c23.setCellValue("公司id");
        HSSFCell c24 = r0.createCell(24);
        c24.setCellStyle(headerStyle);
        c24.setCellValue("供应商分类id");
        for (int i = 0; i < list.size(); i++) {
            Supplier sup = list.get(i);
            HSSFRow row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(sup.getSupplier_id());
            row.createCell(1).setCellValue(sup.getSupplier_code());
            row.createCell(2).setCellValue(sup.getSupplier_code_private());
            row.createCell(3).setCellValue(sup.getSupplier_name());
//            HSSFCell cell4 = row.createCell(4);
//            cell4.setCellStyle(dateCellStyle);
//            cell4.setCellValue(sup.getBirthday());
            row.createCell(4).setCellValue(sup.getSupplier_abbreviation());
            row.createCell(5).setCellValue(sup.getContact());
            row.createCell(6).setCellValue(sup.getContact_position());
            row.createCell(7).setCellValue(sup.getContact_sex());
            row.createCell(8).setCellValue(sup.getContact_number());
            row.createCell(9).setCellValue(sup.getBegin_arrears());
            row.createCell(10).setCellValue(sup.getBank());
            row.createCell(11).setCellValue(sup.getBank_number());
            row.createCell(12).setCellValue(sup.getCompany_phone());
            row.createCell(13).setCellValue(sup.getFax());
            row.createCell(14).setCellValue(sup.getEmail());
            row.createCell(15).setCellValue(sup.getZip_code());
            row.createCell(16).setCellValue(sup.getQq_number());
            row.createCell(17).setCellValue(sup.getRemarks());
            row.createCell(18).setCellValue(""+sup.getStatus());
            row.createCell(19).setCellValue(""+sup.getCompanyID());
            row.createCell(20).setCellValue(""+sup.getSupplier_category_id());
            row.createCell(21).setCellValue(sup.getWechat_number());
            row.createCell(22).setCellValue(sup.getContact_address());
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setContentDispositionFormData("attachment", new String("供应商表.xls".getBytes("UTF-8"), "ISO-8859-1"));
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            workbook.write(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.CREATED);
    }

    /**
     * Excel 解析成 员工数据集合
     *
     * @param file
//     * @param allNations
//     * @param allPoliticsstatus
//     * @param allDepartments
//     * @param allPositions
//     * @param allJobLevels
     * @return
     */
    public static List<Supplier> excel2Supplier(MultipartFile file
//                                                List<Nation> allNations,
//                                                List<Politicsstatus> allPoliticsstatus,
//                                                List<Department> allDepartments,
//                                                List<Position> allPositions,
//                                                List<JobLevel> allJobLevels
    ) {
        List<Supplier> list = new ArrayList<>();
        Supplier supplier = null;
        try {
            //1. 创建一个 workbook 对象
            HSSFWorkbook workbook = new HSSFWorkbook(file.getInputStream());
            //2. 获取 workbook 中表单的数量
            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                //3. 获取表单
                HSSFSheet sheet = workbook.getSheetAt(i);
                //4. 获取表单中的行数
                int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
                for (int j = 0; j < physicalNumberOfRows; j++) {
                    //5. 跳过标题行
                    if (j == 0) {
                        continue;//跳过标题行
                    }
                    //6. 获取行
                    HSSFRow row = sheet.getRow(j);
                    if (row == null) {
                        continue;//防止数据中间有空行
                    }
                    //7. 获取列数
                    int physicalNumberOfCells = row.getPhysicalNumberOfCells();
                    supplier = new Supplier();
                    for (int k = 0; k < physicalNumberOfCells; k++) {
//                        System.out.println("physicalNumberOfCells"+physicalNumberOfCells);
//                        System.out.println("k=" + k);
                        HSSFCell cell = row.getCell(k);
                        switch (cell.getCellType()) {
                            case STRING:    //如果是String
                                String cellValue = cell.getStringCellValue();
                                switch (k) {    //看它是第几列的内容
                                    case 1:
                                        supplier.setSupplier_code(cellValue);
                                        break;
                                    case 2:
                                        supplier.setSupplier_code_private(cellValue);
                                        break;
                                    case 3:
                                        supplier.setSupplier_name(cellValue);
                                        break;
                                    case 4:
                                        supplier.setSupplier_abbreviation(cellValue);
                                        break;
                                    case 5:
                                        supplier.setContact(cellValue);
                                        break;
                                    case 6:
                                        supplier.setContact_position(cellValue);
                                        break;
                                    case 7:
//                                        int nationIndex = allNations.indexOf(new Nation(cellValue));
//                                        supplier.setNationId(allNations.get(nationIndex).getId());
                                        supplier.setContact_sex(cellValue);
                                        break;
                                    case 8:
                                        supplier.setContact_number(cellValue);
                                        break;
                                    case 9:
                                        supplier.setBegin_arrears(cellValue);
                                        break;
                                    case 10:
                                        supplier.setBank(cellValue);
                                        break;
                                    case 11:
                                        supplier.setBank_number(cellValue);
                                        break;
                                    case 12:
                                        supplier.setCompany_phone(cellValue);
                                        break;
                                    case 13:
                                        supplier.setFax(cellValue);
                                        break;
                                    case 14:
                                        supplier.setEmail(cellValue);
                                        break;
                                    case 15:
                                        supplier.setZip_code(cellValue);
                                        break;
                                    case 16:
                                        supplier.setQq_number(cellValue);
                                        break;
                                    case 17:
                                        supplier.setRemarks(cellValue);
                                        break;

                                    case 21:
                                        supplier.setWechat_number(cellValue);
                                        break;
                                    case 22:
                                        supplier.setContact_address(cellValue);
                                        break;


                                }
                                break;
                            default: {
                                switch (k) {
//                                    case 4:
//                                        employee.setBirthday(cell.getDateCellValue());
//                                        break;
//                                    case 22:
//                                        employee.setContractTerm(cell.getNumericCellValue());
//                                        break;
                                    case 18:
                                        supplier.setStatus((int) cell.getNumericCellValue());
                                        break;
                                    case 19:
                                        supplier.setCompanyID((int) cell.getNumericCellValue());
                                        break;
                                    case 20:
                                        supplier.setSupplier_category_id((int) cell.getNumericCellValue());
                                        break;

                                }
                            }
                            break;
                        }
                    }
                    list.add(supplier);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
