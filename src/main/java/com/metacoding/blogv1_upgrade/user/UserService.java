package com.metacoding.blogv1_upgrade.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void 회원가입(UserRequest.JoinDTO joinDTO) {
        // 1. 동일 user 있는지 조회
        User user = userRepository.findById(joinDTO.getUsername());
        if (user != null) {
            throw new RuntimeException("동일한 username이 존재합니다.");
        }

        // 회원가입
        userRepository.save(joinDTO.getUsername(), joinDTO.getPassword(), joinDTO.getFullname());

    }

    public User 로그인(UserRequest.LoginDTO loginDTO) {
        // user 존재유무 검사
        User user = userRepository.findById(loginDTO.getUsername());

        // username, password가 불일치하는 것들을 Filtering
        if (user == null) {
            throw new RuntimeException("해당 username이 존재하지 않습니다.");
        }

        if (!(user.getPassword().equals(loginDTO.getPassword()))) {
            throw new RuntimeException("해당 password가 일치하지 않습니다.");
        }
        // 인증
        return user;

    }


}
