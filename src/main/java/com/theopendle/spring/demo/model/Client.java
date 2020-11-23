package com.theopendle.spring.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * A simple Client bean for demo purposes.
 *
 * @author Theo Pendle
 */
@Accessors(chain = true)
@Data
public class Client implements Serializable {
    /**
     * SerialVersionUID là một mã định danh duy nhất cho mỗi lớp,
     * JVM sử dụng nó để so sánh các phiên bản của lớp đảm bảo rằng cùng một lớp
     * được sử dụng trong Quá trình tuần tự hóa được tải trong quá trình Deserialization.
     *
     * Việc chỉ định một cái cho nhiều quyền kiểm soát hơn, mặc dù JVM sẽ tạo một cái nếu bạn không chỉ định.
     * Giá trị được tạo ra có thể khác nhau giữa các trình biên dịch khác nhau.
     * Hơn nữa, đôi khi bạn chỉ muốn một số lý do để cấm khử lưu trữ các đối tượng được tuần tự hóa cũ [backward incompatibility],
     * và trong trường hợp này, bạn chỉ cần thay đổi serialVersionUID.
     * */
    private static final long serialVersionUID = -6673532093586278058L;

    private Long id;
    private String firstName;
    private String lastName;
}
