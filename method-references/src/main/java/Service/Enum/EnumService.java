package Service.Enum;

import Service.*;

public enum EnumService implements IService {

    ABSTRACT_METHOD_REFERENCE {
        public TextService getService() {
            return new AbstractMethodReferenceTextService();
        }
    },

    ANONYMOUS {
        @Override
        public TextService getService() {
            return new AnonymousTextService();
        }
    },

    LAMBDA {
        @Override
        public TextService getService() {
            return new LambdaTextService();
        }
    },

    METHOD_REFERENCE {
        @Override
        public TextService getService() {
            return new MethodReferenceTextService();
        }
    }

}
