package issue11755

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.simp.SimpMessagingTemplate

class MessageController {

    @Autowired SimpMessagingTemplate simpMessagingTemplate

    def index() {
        render 'Success'
    }
}
