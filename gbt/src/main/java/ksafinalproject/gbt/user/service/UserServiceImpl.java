package ksafinalproject.gbt.user.service;

import ksafinalproject.gbt.user.dto.IUser;
import ksafinalproject.gbt.user.model.User;
import ksafinalproject.gbt.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public int saveUser(IUser iUser) {
        log.info("save user : {}", iUser);
        try {
            if (userRepository.findByUserName(iUser.getUserName()).isPresent()){
                return 2;
            }
            userRepository.save(User.builder()
                    .id(iUser.getId())
                    .userName(iUser.getUserName())
                    .gender(iUser.getGender())
                    .birthYear(LocalDate.of(iUser.getBirthYear(),1,1))
                    .smokingYear(iUser.getSmokingYear())
                    .comment(iUser.getComment())
                    .price(iUser.getPrice())
                    .ranking(iUser.getRanking())
                    .profileImg(iUser.getProfileImg())
                    .popupImg(iUser.getPopupImg())
                    .averageSmoking(iUser.getAverageSmoking())
                    .point(iUser.getPoint())
                    .badgeId(iUser.getBadgeId())
                    .build());
            return 1;
        } catch (Exception e) {
            log.error("Error : {}", e.getMessage());
            return 3;
        }
    }

    @Override
    public Optional<User> getUserById(Long id) {
        log.info("find user by id: {}", id);
        try {
            return userRepository.findById(id);
        } catch (Exception e) {
            log.error("Error : {}", e.getMessage());
            return Optional.empty();
        }
    }

    @Override
    public List<User> getAllUser() {
        log.info("find all user");
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            log.error("Error : {}", e.getMessage());
            return null;
        }
    }

    @Override
    public void deleteUserById(Long id) {
        log.info("delete user by id");
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            log.error("Error : {}", e.getMessage());
        }
    }

    @Override
    public Optional<User> getUserByUserName(String userName) {
        log.info("find user by name : {}", userName);
        try {
            return userRepository.findByUserName(userName);
        } catch (Exception e) {
            log.error("Error : {} ", e.getMessage());
            return Optional.empty();
        }
    }
}
