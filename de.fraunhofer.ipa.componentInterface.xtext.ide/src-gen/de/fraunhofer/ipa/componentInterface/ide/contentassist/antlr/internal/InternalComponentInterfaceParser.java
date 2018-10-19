package de.fraunhofer.ipa.componentInterface.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GraphName'", "'ComponentInterface'", "'{'", "'name'", "'}'", "'namespace'", "'publisher'", "'subscriber'", "'serviceServer'", "'serviceClient'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'MessageDefinition'", "'ServiceServer'", "'ServiceName'", "'SrvRef'", "'ServiceClient'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentInterfaceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentInterfaceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentInterfaceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }


    	private ComponentInterfaceGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentInterfaceGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleComponentInterface"
    // InternalComponentInterface.g:53:1: entryRuleComponentInterface : ruleComponentInterface EOF ;
    public final void entryRuleComponentInterface() throws RecognitionException {
        try {
            // InternalComponentInterface.g:54:1: ( ruleComponentInterface EOF )
            // InternalComponentInterface.g:55:1: ruleComponentInterface EOF
            {
             before(grammarAccess.getComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInterface();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalComponentInterface.g:62:1: ruleComponentInterface : ( ( rule__ComponentInterface__Group__0 ) ) ;
    public final void ruleComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:66:2: ( ( ( rule__ComponentInterface__Group__0 ) ) )
            // InternalComponentInterface.g:67:2: ( ( rule__ComponentInterface__Group__0 ) )
            {
            // InternalComponentInterface.g:67:2: ( ( rule__ComponentInterface__Group__0 ) )
            // InternalComponentInterface.g:68:3: ( rule__ComponentInterface__Group__0 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup()); 
            // InternalComponentInterface.g:69:3: ( rule__ComponentInterface__Group__0 )
            // InternalComponentInterface.g:69:4: rule__ComponentInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "entryRuleNamespace"
    // InternalComponentInterface.g:78:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:79:1: ( ruleNamespace EOF )
            // InternalComponentInterface.g:80:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalComponentInterface.g:87:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:91:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalComponentInterface.g:92:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalComponentInterface.g:92:2: ( ( rule__Namespace__Alternatives ) )
            // InternalComponentInterface.g:93:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalComponentInterface.g:94:3: ( rule__Namespace__Alternatives )
            // InternalComponentInterface.g:94:4: rule__Namespace__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalComponentInterface.g:103:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalComponentInterface.g:104:1: ( ruleGraphName EOF )
            // InternalComponentInterface.g:105:1: ruleGraphName EOF
            {
             before(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGraphNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalComponentInterface.g:112:1: ruleGraphName : ( ( rule__GraphName__Alternatives ) ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:116:2: ( ( ( rule__GraphName__Alternatives ) ) )
            // InternalComponentInterface.g:117:2: ( ( rule__GraphName__Alternatives ) )
            {
            // InternalComponentInterface.g:117:2: ( ( rule__GraphName__Alternatives ) )
            // InternalComponentInterface.g:118:3: ( rule__GraphName__Alternatives )
            {
             before(grammarAccess.getGraphNameAccess().getAlternatives()); 
            // InternalComponentInterface.g:119:3: ( rule__GraphName__Alternatives )
            // InternalComponentInterface.g:119:4: rule__GraphName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalComponentInterface.g:128:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:129:1: ( ruleGlobalNamespace EOF )
            // InternalComponentInterface.g:130:1: ruleGlobalNamespace EOF
            {
             before(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalNamespace();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalComponentInterface.g:137:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:141:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalComponentInterface.g:142:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalComponentInterface.g:142:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalComponentInterface.g:143:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalComponentInterface.g:144:3: ( rule__GlobalNamespace__Group__0 )
            // InternalComponentInterface.g:144:4: rule__GlobalNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalComponentInterface.g:153:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalComponentInterface.g:154:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalComponentInterface.g:155:1: ruleRelativeNamespace_Impl EOF
            {
             before(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeNamespace_Impl();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalComponentInterface.g:162:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:166:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalComponentInterface.g:167:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalComponentInterface.g:167:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalComponentInterface.g:168:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalComponentInterface.g:169:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalComponentInterface.g:169:4: rule__RelativeNamespace_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalComponentInterface.g:178:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalComponentInterface.g:179:1: ( rulePrivateNamespace EOF )
            // InternalComponentInterface.g:180:1: rulePrivateNamespace EOF
            {
             before(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            rulePrivateNamespace();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalComponentInterface.g:187:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:191:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalComponentInterface.g:192:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalComponentInterface.g:192:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalComponentInterface.g:193:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalComponentInterface.g:194:3: ( rule__PrivateNamespace__Group__0 )
            // InternalComponentInterface.g:194:4: rule__PrivateNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentInterface.g:204:1: ( ruleEString EOF )
            // InternalComponentInterface.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComponentInterface.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalComponentInterface.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalComponentInterface.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalComponentInterface.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalComponentInterface.g:219:3: ( rule__EString__Alternatives )
            // InternalComponentInterface.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePublisher"
    // InternalComponentInterface.g:228:1: entryRulePublisher : rulePublisher EOF ;
    public final void entryRulePublisher() throws RecognitionException {
        try {
            // InternalComponentInterface.g:229:1: ( rulePublisher EOF )
            // InternalComponentInterface.g:230:1: rulePublisher EOF
            {
             before(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getPublisherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalComponentInterface.g:237:1: rulePublisher : ( ( rule__Publisher__Group__0 ) ) ;
    public final void rulePublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:241:2: ( ( ( rule__Publisher__Group__0 ) ) )
            // InternalComponentInterface.g:242:2: ( ( rule__Publisher__Group__0 ) )
            {
            // InternalComponentInterface.g:242:2: ( ( rule__Publisher__Group__0 ) )
            // InternalComponentInterface.g:243:3: ( rule__Publisher__Group__0 )
            {
             before(grammarAccess.getPublisherAccess().getGroup()); 
            // InternalComponentInterface.g:244:3: ( rule__Publisher__Group__0 )
            // InternalComponentInterface.g:244:4: rule__Publisher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalComponentInterface.g:253:1: entryRuleSubscriber : ruleSubscriber EOF ;
    public final void entryRuleSubscriber() throws RecognitionException {
        try {
            // InternalComponentInterface.g:254:1: ( ruleSubscriber EOF )
            // InternalComponentInterface.g:255:1: ruleSubscriber EOF
            {
             before(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getSubscriberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalComponentInterface.g:262:1: ruleSubscriber : ( ( rule__Subscriber__Group__0 ) ) ;
    public final void ruleSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:266:2: ( ( ( rule__Subscriber__Group__0 ) ) )
            // InternalComponentInterface.g:267:2: ( ( rule__Subscriber__Group__0 ) )
            {
            // InternalComponentInterface.g:267:2: ( ( rule__Subscriber__Group__0 ) )
            // InternalComponentInterface.g:268:3: ( rule__Subscriber__Group__0 )
            {
             before(grammarAccess.getSubscriberAccess().getGroup()); 
            // InternalComponentInterface.g:269:3: ( rule__Subscriber__Group__0 )
            // InternalComponentInterface.g:269:4: rule__Subscriber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalComponentInterface.g:278:1: entryRuleMessageDefinition : ruleMessageDefinition EOF ;
    public final void entryRuleMessageDefinition() throws RecognitionException {
        try {
            // InternalComponentInterface.g:279:1: ( ruleMessageDefinition EOF )
            // InternalComponentInterface.g:280:1: ruleMessageDefinition EOF
            {
             before(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageDefinition();

            state._fsp--;

             after(grammarAccess.getMessageDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalComponentInterface.g:287:1: ruleMessageDefinition : ( ( rule__MessageDefinition__Group__0 ) ) ;
    public final void ruleMessageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:291:2: ( ( ( rule__MessageDefinition__Group__0 ) ) )
            // InternalComponentInterface.g:292:2: ( ( rule__MessageDefinition__Group__0 ) )
            {
            // InternalComponentInterface.g:292:2: ( ( rule__MessageDefinition__Group__0 ) )
            // InternalComponentInterface.g:293:3: ( rule__MessageDefinition__Group__0 )
            {
             before(grammarAccess.getMessageDefinitionAccess().getGroup()); 
            // InternalComponentInterface.g:294:3: ( rule__MessageDefinition__Group__0 )
            // InternalComponentInterface.g:294:4: rule__MessageDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "entryRuleServiceServer"
    // InternalComponentInterface.g:303:1: entryRuleServiceServer : ruleServiceServer EOF ;
    public final void entryRuleServiceServer() throws RecognitionException {
        try {
            // InternalComponentInterface.g:304:1: ( ruleServiceServer EOF )
            // InternalComponentInterface.g:305:1: ruleServiceServer EOF
            {
             before(grammarAccess.getServiceServerRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceServer();

            state._fsp--;

             after(grammarAccess.getServiceServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceServer"


    // $ANTLR start "ruleServiceServer"
    // InternalComponentInterface.g:312:1: ruleServiceServer : ( ( rule__ServiceServer__Group__0 ) ) ;
    public final void ruleServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:316:2: ( ( ( rule__ServiceServer__Group__0 ) ) )
            // InternalComponentInterface.g:317:2: ( ( rule__ServiceServer__Group__0 ) )
            {
            // InternalComponentInterface.g:317:2: ( ( rule__ServiceServer__Group__0 ) )
            // InternalComponentInterface.g:318:3: ( rule__ServiceServer__Group__0 )
            {
             before(grammarAccess.getServiceServerAccess().getGroup()); 
            // InternalComponentInterface.g:319:3: ( rule__ServiceServer__Group__0 )
            // InternalComponentInterface.g:319:4: rule__ServiceServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceServer"


    // $ANTLR start "entryRuleServiceClient"
    // InternalComponentInterface.g:328:1: entryRuleServiceClient : ruleServiceClient EOF ;
    public final void entryRuleServiceClient() throws RecognitionException {
        try {
            // InternalComponentInterface.g:329:1: ( ruleServiceClient EOF )
            // InternalComponentInterface.g:330:1: ruleServiceClient EOF
            {
             before(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceClient();

            state._fsp--;

             after(grammarAccess.getServiceClientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // InternalComponentInterface.g:337:1: ruleServiceClient : ( ( rule__ServiceClient__Group__0 ) ) ;
    public final void ruleServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:341:2: ( ( ( rule__ServiceClient__Group__0 ) ) )
            // InternalComponentInterface.g:342:2: ( ( rule__ServiceClient__Group__0 ) )
            {
            // InternalComponentInterface.g:342:2: ( ( rule__ServiceClient__Group__0 ) )
            // InternalComponentInterface.g:343:3: ( rule__ServiceClient__Group__0 )
            {
             before(grammarAccess.getServiceClientAccess().getGroup()); 
            // InternalComponentInterface.g:344:3: ( rule__ServiceClient__Group__0 )
            // InternalComponentInterface.g:344:4: rule__ServiceClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceClient"


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalComponentInterface.g:352:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:356:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:357:2: ( ruleGlobalNamespace )
                    {
                    // InternalComponentInterface.g:357:2: ( ruleGlobalNamespace )
                    // InternalComponentInterface.g:358:3: ruleGlobalNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGlobalNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:363:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalComponentInterface.g:363:2: ( ruleRelativeNamespace_Impl )
                    // InternalComponentInterface.g:364:3: ruleRelativeNamespace_Impl
                    {
                     before(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelativeNamespace_Impl();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:369:2: ( rulePrivateNamespace )
                    {
                    // InternalComponentInterface.g:369:2: ( rulePrivateNamespace )
                    // InternalComponentInterface.g:370:3: rulePrivateNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrivateNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Alternatives"


    // $ANTLR start "rule__GraphName__Alternatives"
    // InternalComponentInterface.g:379:1: rule__GraphName__Alternatives : ( ( RULE_STRING ) | ( 'GraphName' ) );
    public final void rule__GraphName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:383:1: ( ( RULE_STRING ) | ( 'GraphName' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:384:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:384:2: ( RULE_STRING )
                    // InternalComponentInterface.g:385:3: RULE_STRING
                    {
                     before(grammarAccess.getGraphNameAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getGraphNameAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:390:2: ( 'GraphName' )
                    {
                    // InternalComponentInterface.g:390:2: ( 'GraphName' )
                    // InternalComponentInterface.g:391:3: 'GraphName'
                    {
                     before(grammarAccess.getGraphNameAccess().getGraphNameKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getGraphNameAccess().getGraphNameKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphName__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalComponentInterface.g:400:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:404:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:405:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:405:2: ( RULE_STRING )
                    // InternalComponentInterface.g:406:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:411:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:411:2: ( RULE_ID )
                    // InternalComponentInterface.g:412:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalComponentInterface.g:421:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:425:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:426:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__0"


    // $ANTLR start "rule__ComponentInterface__Group__0__Impl"
    // InternalComponentInterface.g:433:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:437:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:438:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:438:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:439:2: 'ComponentInterface'
            {
             before(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__1"
    // InternalComponentInterface.g:448:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:452:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:453:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__1"


    // $ANTLR start "rule__ComponentInterface__Group__1__Impl"
    // InternalComponentInterface.g:460:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:464:1: ( ( '{' ) )
            // InternalComponentInterface.g:465:1: ( '{' )
            {
            // InternalComponentInterface.g:465:1: ( '{' )
            // InternalComponentInterface.g:466:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__2"
    // InternalComponentInterface.g:475:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:479:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:480:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__2"


    // $ANTLR start "rule__ComponentInterface__Group__2__Impl"
    // InternalComponentInterface.g:487:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:491:1: ( ( 'name' ) )
            // InternalComponentInterface.g:492:1: ( 'name' )
            {
            // InternalComponentInterface.g:492:1: ( 'name' )
            // InternalComponentInterface.g:493:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__3"
    // InternalComponentInterface.g:502:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:506:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:507:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__3"


    // $ANTLR start "rule__ComponentInterface__Group__3__Impl"
    // InternalComponentInterface.g:514:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:518:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalComponentInterface.g:519:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalComponentInterface.g:519:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalComponentInterface.g:520:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalComponentInterface.g:521:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalComponentInterface.g:521:3: rule__ComponentInterface__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__4"
    // InternalComponentInterface.g:529:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:533:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:534:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__4"


    // $ANTLR start "rule__ComponentInterface__Group__4__Impl"
    // InternalComponentInterface.g:541:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:545:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:546:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:546:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:547:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:548:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:548:3: rule__ComponentInterface__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__5"
    // InternalComponentInterface.g:556:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:560:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:561:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__5"


    // $ANTLR start "rule__ComponentInterface__Group__5__Impl"
    // InternalComponentInterface.g:568:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:572:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:573:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:573:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:574:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:575:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:575:3: rule__ComponentInterface__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__5__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__6"
    // InternalComponentInterface.g:583:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:587:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:588:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__6"


    // $ANTLR start "rule__ComponentInterface__Group__6__Impl"
    // InternalComponentInterface.g:595:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:599:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalComponentInterface.g:600:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalComponentInterface.g:600:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalComponentInterface.g:601:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalComponentInterface.g:602:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:602:3: rule__ComponentInterface__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__6__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__7"
    // InternalComponentInterface.g:610:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:614:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalComponentInterface.g:615:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__7"


    // $ANTLR start "rule__ComponentInterface__Group__7__Impl"
    // InternalComponentInterface.g:622:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:626:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalComponentInterface.g:627:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalComponentInterface.g:627:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalComponentInterface.g:628:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalComponentInterface.g:629:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:629:3: rule__ComponentInterface__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__7__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__8"
    // InternalComponentInterface.g:637:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:641:1: ( rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 )
            // InternalComponentInterface.g:642:2: rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__8"


    // $ANTLR start "rule__ComponentInterface__Group__8__Impl"
    // InternalComponentInterface.g:649:1: rule__ComponentInterface__Group__8__Impl : ( ( rule__ComponentInterface__Group_8__0 )? ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:653:1: ( ( ( rule__ComponentInterface__Group_8__0 )? ) )
            // InternalComponentInterface.g:654:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            {
            // InternalComponentInterface.g:654:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            // InternalComponentInterface.g:655:2: ( rule__ComponentInterface__Group_8__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 
            // InternalComponentInterface.g:656:2: ( rule__ComponentInterface__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:656:3: rule__ComponentInterface__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__8__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__9"
    // InternalComponentInterface.g:664:1: rule__ComponentInterface__Group__9 : rule__ComponentInterface__Group__9__Impl ;
    public final void rule__ComponentInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:668:1: ( rule__ComponentInterface__Group__9__Impl )
            // InternalComponentInterface.g:669:2: rule__ComponentInterface__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__9"


    // $ANTLR start "rule__ComponentInterface__Group__9__Impl"
    // InternalComponentInterface.g:675:1: rule__ComponentInterface__Group__9__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:679:1: ( ( '}' ) )
            // InternalComponentInterface.g:680:1: ( '}' )
            {
            // InternalComponentInterface.g:680:1: ( '}' )
            // InternalComponentInterface.g:681:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__9__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__0"
    // InternalComponentInterface.g:691:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:695:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:696:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__0"


    // $ANTLR start "rule__ComponentInterface__Group_4__0__Impl"
    // InternalComponentInterface.g:703:1: rule__ComponentInterface__Group_4__0__Impl : ( 'namespace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:707:1: ( ( 'namespace' ) )
            // InternalComponentInterface.g:708:1: ( 'namespace' )
            {
            // InternalComponentInterface.g:708:1: ( 'namespace' )
            // InternalComponentInterface.g:709:2: 'namespace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNamespaceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__1"
    // InternalComponentInterface.g:718:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:722:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalComponentInterface.g:723:2: rule__ComponentInterface__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__1"


    // $ANTLR start "rule__ComponentInterface__Group_4__1__Impl"
    // InternalComponentInterface.g:729:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:733:1: ( ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) ) )
            // InternalComponentInterface.g:734:1: ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:734:1: ( ( rule__ComponentInterface__NamespaceAssignment_4_1 ) )
            // InternalComponentInterface.g:735:2: ( rule__ComponentInterface__NamespaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceAssignment_4_1()); 
            // InternalComponentInterface.g:736:2: ( rule__ComponentInterface__NamespaceAssignment_4_1 )
            // InternalComponentInterface.g:736:3: rule__ComponentInterface__NamespaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NamespaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNamespaceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__0"
    // InternalComponentInterface.g:745:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:749:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:750:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__0"


    // $ANTLR start "rule__ComponentInterface__Group_5__0__Impl"
    // InternalComponentInterface.g:757:1: rule__ComponentInterface__Group_5__0__Impl : ( 'publisher' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:761:1: ( ( 'publisher' ) )
            // InternalComponentInterface.g:762:1: ( 'publisher' )
            {
            // InternalComponentInterface.g:762:1: ( 'publisher' )
            // InternalComponentInterface.g:763:2: 'publisher'
            {
             before(grammarAccess.getComponentInterfaceAccess().getPublisherKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getPublisherKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__1"
    // InternalComponentInterface.g:772:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:776:1: ( rule__ComponentInterface__Group_5__1__Impl )
            // InternalComponentInterface.g:777:2: rule__ComponentInterface__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__1"


    // $ANTLR start "rule__ComponentInterface__Group_5__1__Impl"
    // InternalComponentInterface.g:783:1: rule__ComponentInterface__Group_5__1__Impl : ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:787:1: ( ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) ) )
            // InternalComponentInterface.g:788:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:788:1: ( ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 ) )
            // InternalComponentInterface.g:789:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_1()); 
            // InternalComponentInterface.g:790:2: ( rule__ComponentInterface__RosTopicPublisherAssignment_5_1 )
            // InternalComponentInterface.g:790:3: rule__ComponentInterface__RosTopicPublisherAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicPublisherAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__0"
    // InternalComponentInterface.g:799:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:803:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalComponentInterface.g:804:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__ComponentInterface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__0"


    // $ANTLR start "rule__ComponentInterface__Group_6__0__Impl"
    // InternalComponentInterface.g:811:1: rule__ComponentInterface__Group_6__0__Impl : ( 'subscriber' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:815:1: ( ( 'subscriber' ) )
            // InternalComponentInterface.g:816:1: ( 'subscriber' )
            {
            // InternalComponentInterface.g:816:1: ( 'subscriber' )
            // InternalComponentInterface.g:817:2: 'subscriber'
            {
             before(grammarAccess.getComponentInterfaceAccess().getSubscriberKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getSubscriberKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__1"
    // InternalComponentInterface.g:826:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:830:1: ( rule__ComponentInterface__Group_6__1__Impl )
            // InternalComponentInterface.g:831:2: rule__ComponentInterface__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__1"


    // $ANTLR start "rule__ComponentInterface__Group_6__1__Impl"
    // InternalComponentInterface.g:837:1: rule__ComponentInterface__Group_6__1__Impl : ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:841:1: ( ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) ) )
            // InternalComponentInterface.g:842:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) )
            {
            // InternalComponentInterface.g:842:1: ( ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 ) )
            // InternalComponentInterface.g:843:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_1()); 
            // InternalComponentInterface.g:844:2: ( rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 )
            // InternalComponentInterface.g:844:3: rule__ComponentInterface__RosTopicSubscriberAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosTopicSubscriberAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__0"
    // InternalComponentInterface.g:853:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:857:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalComponentInterface.g:858:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__ComponentInterface__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__0"


    // $ANTLR start "rule__ComponentInterface__Group_7__0__Impl"
    // InternalComponentInterface.g:865:1: rule__ComponentInterface__Group_7__0__Impl : ( 'serviceServer' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:869:1: ( ( 'serviceServer' ) )
            // InternalComponentInterface.g:870:1: ( 'serviceServer' )
            {
            // InternalComponentInterface.g:870:1: ( 'serviceServer' )
            // InternalComponentInterface.g:871:2: 'serviceServer'
            {
             before(grammarAccess.getComponentInterfaceAccess().getServiceServerKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getServiceServerKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__1"
    // InternalComponentInterface.g:880:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:884:1: ( rule__ComponentInterface__Group_7__1__Impl )
            // InternalComponentInterface.g:885:2: rule__ComponentInterface__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__1"


    // $ANTLR start "rule__ComponentInterface__Group_7__1__Impl"
    // InternalComponentInterface.g:891:1: rule__ComponentInterface__Group_7__1__Impl : ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:895:1: ( ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) ) )
            // InternalComponentInterface.g:896:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) )
            {
            // InternalComponentInterface.g:896:1: ( ( rule__ComponentInterface__RosServiceServerAssignment_7_1 ) )
            // InternalComponentInterface.g:897:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_1()); 
            // InternalComponentInterface.g:898:2: ( rule__ComponentInterface__RosServiceServerAssignment_7_1 )
            // InternalComponentInterface.g:898:3: rule__ComponentInterface__RosServiceServerAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceServerAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__0"
    // InternalComponentInterface.g:907:1: rule__ComponentInterface__Group_8__0 : rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 ;
    public final void rule__ComponentInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:911:1: ( rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 )
            // InternalComponentInterface.g:912:2: rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentInterface__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__0"


    // $ANTLR start "rule__ComponentInterface__Group_8__0__Impl"
    // InternalComponentInterface.g:919:1: rule__ComponentInterface__Group_8__0__Impl : ( 'serviceClient' ) ;
    public final void rule__ComponentInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:923:1: ( ( 'serviceClient' ) )
            // InternalComponentInterface.g:924:1: ( 'serviceClient' )
            {
            // InternalComponentInterface.g:924:1: ( 'serviceClient' )
            // InternalComponentInterface.g:925:2: 'serviceClient'
            {
             before(grammarAccess.getComponentInterfaceAccess().getServiceClientKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getServiceClientKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__1"
    // InternalComponentInterface.g:934:1: rule__ComponentInterface__Group_8__1 : rule__ComponentInterface__Group_8__1__Impl ;
    public final void rule__ComponentInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:938:1: ( rule__ComponentInterface__Group_8__1__Impl )
            // InternalComponentInterface.g:939:2: rule__ComponentInterface__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__1"


    // $ANTLR start "rule__ComponentInterface__Group_8__1__Impl"
    // InternalComponentInterface.g:945:1: rule__ComponentInterface__Group_8__1__Impl : ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) ) ;
    public final void rule__ComponentInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:949:1: ( ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) ) )
            // InternalComponentInterface.g:950:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) )
            {
            // InternalComponentInterface.g:950:1: ( ( rule__ComponentInterface__RosServiceClientAssignment_8_1 ) )
            // InternalComponentInterface.g:951:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_1()); 
            // InternalComponentInterface.g:952:2: ( rule__ComponentInterface__RosServiceClientAssignment_8_1 )
            // InternalComponentInterface.g:952:3: rule__ComponentInterface__RosServiceClientAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosServiceClientAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalComponentInterface.g:961:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:965:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalComponentInterface.g:966:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__GlobalNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__0"


    // $ANTLR start "rule__GlobalNamespace__Group__0__Impl"
    // InternalComponentInterface.g:973:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:977:1: ( ( () ) )
            // InternalComponentInterface.g:978:1: ( () )
            {
            // InternalComponentInterface.g:978:1: ( () )
            // InternalComponentInterface.g:979:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalComponentInterface.g:980:2: ()
            // InternalComponentInterface.g:980:3: 
            {
            }

             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__1"
    // InternalComponentInterface.g:988:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:992:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalComponentInterface.g:993:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__GlobalNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__1"


    // $ANTLR start "rule__GlobalNamespace__Group__1__Impl"
    // InternalComponentInterface.g:1000:1: rule__GlobalNamespace__Group__1__Impl : ( 'GlobalNamespace' ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1004:1: ( ( 'GlobalNamespace' ) )
            // InternalComponentInterface.g:1005:1: ( 'GlobalNamespace' )
            {
            // InternalComponentInterface.g:1005:1: ( 'GlobalNamespace' )
            // InternalComponentInterface.g:1006:2: 'GlobalNamespace'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__2"
    // InternalComponentInterface.g:1015:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1019:1: ( rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 )
            // InternalComponentInterface.g:1020:2: rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__GlobalNamespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__2"


    // $ANTLR start "rule__GlobalNamespace__Group__2__Impl"
    // InternalComponentInterface.g:1027:1: rule__GlobalNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1031:1: ( ( '{' ) )
            // InternalComponentInterface.g:1032:1: ( '{' )
            {
            // InternalComponentInterface.g:1032:1: ( '{' )
            // InternalComponentInterface.g:1033:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__3"
    // InternalComponentInterface.g:1042:1: rule__GlobalNamespace__Group__3 : rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 ;
    public final void rule__GlobalNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1046:1: ( rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 )
            // InternalComponentInterface.g:1047:2: rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__GlobalNamespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__3"


    // $ANTLR start "rule__GlobalNamespace__Group__3__Impl"
    // InternalComponentInterface.g:1054:1: rule__GlobalNamespace__Group__3__Impl : ( ( rule__GlobalNamespace__Group_3__0 )? ) ;
    public final void rule__GlobalNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1058:1: ( ( ( rule__GlobalNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:1059:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1059:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:1060:2: ( rule__GlobalNamespace__Group_3__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:1061:2: ( rule__GlobalNamespace__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:1061:3: rule__GlobalNamespace__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalNamespace__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__4"
    // InternalComponentInterface.g:1069:1: rule__GlobalNamespace__Group__4 : rule__GlobalNamespace__Group__4__Impl ;
    public final void rule__GlobalNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1073:1: ( rule__GlobalNamespace__Group__4__Impl )
            // InternalComponentInterface.g:1074:2: rule__GlobalNamespace__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__4"


    // $ANTLR start "rule__GlobalNamespace__Group__4__Impl"
    // InternalComponentInterface.g:1080:1: rule__GlobalNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1084:1: ( ( '}' ) )
            // InternalComponentInterface.g:1085:1: ( '}' )
            {
            // InternalComponentInterface.g:1085:1: ( '}' )
            // InternalComponentInterface.g:1086:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__4__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__0"
    // InternalComponentInterface.g:1096:1: rule__GlobalNamespace__Group_3__0 : rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 ;
    public final void rule__GlobalNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1100:1: ( rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 )
            // InternalComponentInterface.g:1101:2: rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__GlobalNamespace__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__0"


    // $ANTLR start "rule__GlobalNamespace__Group_3__0__Impl"
    // InternalComponentInterface.g:1108:1: rule__GlobalNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__GlobalNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1112:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1113:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1113:1: ( 'parts' )
            // InternalComponentInterface.g:1114:2: 'parts'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__1"
    // InternalComponentInterface.g:1123:1: rule__GlobalNamespace__Group_3__1 : rule__GlobalNamespace__Group_3__1__Impl ;
    public final void rule__GlobalNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1127:1: ( rule__GlobalNamespace__Group_3__1__Impl )
            // InternalComponentInterface.g:1128:2: rule__GlobalNamespace__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__1"


    // $ANTLR start "rule__GlobalNamespace__Group_3__1__Impl"
    // InternalComponentInterface.g:1134:1: rule__GlobalNamespace__Group_3__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_1 ) ) ;
    public final void rule__GlobalNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1138:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_1 ) ) )
            // InternalComponentInterface.g:1139:1: ( ( rule__GlobalNamespace__PartsAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:1139:1: ( ( rule__GlobalNamespace__PartsAssignment_3_1 ) )
            // InternalComponentInterface.g:1140:2: ( rule__GlobalNamespace__PartsAssignment_3_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_1()); 
            // InternalComponentInterface.g:1141:2: ( rule__GlobalNamespace__PartsAssignment_3_1 )
            // InternalComponentInterface.g:1141:3: rule__GlobalNamespace__PartsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0"
    // InternalComponentInterface.g:1150:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1154:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalComponentInterface.g:1155:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RelativeNamespace_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0__Impl"
    // InternalComponentInterface.g:1162:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1166:1: ( ( () ) )
            // InternalComponentInterface.g:1167:1: ( () )
            {
            // InternalComponentInterface.g:1167:1: ( () )
            // InternalComponentInterface.g:1168:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalComponentInterface.g:1169:2: ()
            // InternalComponentInterface.g:1169:3: 
            {
            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1"
    // InternalComponentInterface.g:1177:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1181:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalComponentInterface.g:1182:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RelativeNamespace_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1__Impl"
    // InternalComponentInterface.g:1189:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( 'RelativeNamespace' ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1193:1: ( ( 'RelativeNamespace' ) )
            // InternalComponentInterface.g:1194:1: ( 'RelativeNamespace' )
            {
            // InternalComponentInterface.g:1194:1: ( 'RelativeNamespace' )
            // InternalComponentInterface.g:1195:2: 'RelativeNamespace'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2"
    // InternalComponentInterface.g:1204:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1208:1: ( rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 )
            // InternalComponentInterface.g:1209:2: rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RelativeNamespace_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2__Impl"
    // InternalComponentInterface.g:1216:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1220:1: ( ( '{' ) )
            // InternalComponentInterface.g:1221:1: ( '{' )
            {
            // InternalComponentInterface.g:1221:1: ( '{' )
            // InternalComponentInterface.g:1222:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__3"
    // InternalComponentInterface.g:1231:1: rule__RelativeNamespace_Impl__Group__3 : rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 ;
    public final void rule__RelativeNamespace_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1235:1: ( rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 )
            // InternalComponentInterface.g:1236:2: rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RelativeNamespace_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__3__Impl"
    // InternalComponentInterface.g:1243:1: rule__RelativeNamespace_Impl__Group__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1247:1: ( ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) )
            // InternalComponentInterface.g:1248:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1248:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            // InternalComponentInterface.g:1249:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 
            // InternalComponentInterface.g:1250:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:1250:3: rule__RelativeNamespace_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeNamespace_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__4"
    // InternalComponentInterface.g:1258:1: rule__RelativeNamespace_Impl__Group__4 : rule__RelativeNamespace_Impl__Group__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1262:1: ( rule__RelativeNamespace_Impl__Group__4__Impl )
            // InternalComponentInterface.g:1263:2: rule__RelativeNamespace_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__4"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__4__Impl"
    // InternalComponentInterface.g:1269:1: rule__RelativeNamespace_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1273:1: ( ( '}' ) )
            // InternalComponentInterface.g:1274:1: ( '}' )
            {
            // InternalComponentInterface.g:1274:1: ( '}' )
            // InternalComponentInterface.g:1275:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__4__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__0"
    // InternalComponentInterface.g:1285:1: rule__RelativeNamespace_Impl__Group_3__0 : rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1289:1: ( rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 )
            // InternalComponentInterface.g:1290:2: rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RelativeNamespace_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__0__Impl"
    // InternalComponentInterface.g:1297:1: rule__RelativeNamespace_Impl__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1301:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1302:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1302:1: ( 'parts' )
            // InternalComponentInterface.g:1303:2: 'parts'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__1"
    // InternalComponentInterface.g:1312:1: rule__RelativeNamespace_Impl__Group_3__1 : rule__RelativeNamespace_Impl__Group_3__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1316:1: ( rule__RelativeNamespace_Impl__Group_3__1__Impl )
            // InternalComponentInterface.g:1317:2: rule__RelativeNamespace_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__1__Impl"
    // InternalComponentInterface.g:1323:1: rule__RelativeNamespace_Impl__Group_3__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1327:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_1 ) ) )
            // InternalComponentInterface.g:1328:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:1328:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_1 ) )
            // InternalComponentInterface.g:1329:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_1()); 
            // InternalComponentInterface.g:1330:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_1 )
            // InternalComponentInterface.g:1330:3: rule__RelativeNamespace_Impl__PartsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__0"
    // InternalComponentInterface.g:1339:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1343:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalComponentInterface.g:1344:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PrivateNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__0"


    // $ANTLR start "rule__PrivateNamespace__Group__0__Impl"
    // InternalComponentInterface.g:1351:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1355:1: ( ( () ) )
            // InternalComponentInterface.g:1356:1: ( () )
            {
            // InternalComponentInterface.g:1356:1: ( () )
            // InternalComponentInterface.g:1357:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalComponentInterface.g:1358:2: ()
            // InternalComponentInterface.g:1358:3: 
            {
            }

             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__1"
    // InternalComponentInterface.g:1366:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1370:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalComponentInterface.g:1371:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PrivateNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__1"


    // $ANTLR start "rule__PrivateNamespace__Group__1__Impl"
    // InternalComponentInterface.g:1378:1: rule__PrivateNamespace__Group__1__Impl : ( 'PrivateNamespace' ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1382:1: ( ( 'PrivateNamespace' ) )
            // InternalComponentInterface.g:1383:1: ( 'PrivateNamespace' )
            {
            // InternalComponentInterface.g:1383:1: ( 'PrivateNamespace' )
            // InternalComponentInterface.g:1384:2: 'PrivateNamespace'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__2"
    // InternalComponentInterface.g:1393:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1397:1: ( rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 )
            // InternalComponentInterface.g:1398:2: rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__PrivateNamespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__2"


    // $ANTLR start "rule__PrivateNamespace__Group__2__Impl"
    // InternalComponentInterface.g:1405:1: rule__PrivateNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1409:1: ( ( '{' ) )
            // InternalComponentInterface.g:1410:1: ( '{' )
            {
            // InternalComponentInterface.g:1410:1: ( '{' )
            // InternalComponentInterface.g:1411:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__3"
    // InternalComponentInterface.g:1420:1: rule__PrivateNamespace__Group__3 : rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 ;
    public final void rule__PrivateNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1424:1: ( rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 )
            // InternalComponentInterface.g:1425:2: rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__PrivateNamespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__3"


    // $ANTLR start "rule__PrivateNamespace__Group__3__Impl"
    // InternalComponentInterface.g:1432:1: rule__PrivateNamespace__Group__3__Impl : ( ( rule__PrivateNamespace__Group_3__0 )? ) ;
    public final void rule__PrivateNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1436:1: ( ( ( rule__PrivateNamespace__Group_3__0 )? ) )
            // InternalComponentInterface.g:1437:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1437:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            // InternalComponentInterface.g:1438:2: ( rule__PrivateNamespace__Group_3__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 
            // InternalComponentInterface.g:1439:2: ( rule__PrivateNamespace__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:1439:3: rule__PrivateNamespace__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrivateNamespace__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__4"
    // InternalComponentInterface.g:1447:1: rule__PrivateNamespace__Group__4 : rule__PrivateNamespace__Group__4__Impl ;
    public final void rule__PrivateNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1451:1: ( rule__PrivateNamespace__Group__4__Impl )
            // InternalComponentInterface.g:1452:2: rule__PrivateNamespace__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__4"


    // $ANTLR start "rule__PrivateNamespace__Group__4__Impl"
    // InternalComponentInterface.g:1458:1: rule__PrivateNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1462:1: ( ( '}' ) )
            // InternalComponentInterface.g:1463:1: ( '}' )
            {
            // InternalComponentInterface.g:1463:1: ( '}' )
            // InternalComponentInterface.g:1464:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__4__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__0"
    // InternalComponentInterface.g:1474:1: rule__PrivateNamespace__Group_3__0 : rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 ;
    public final void rule__PrivateNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1478:1: ( rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 )
            // InternalComponentInterface.g:1479:2: rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__PrivateNamespace__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__0"


    // $ANTLR start "rule__PrivateNamespace__Group_3__0__Impl"
    // InternalComponentInterface.g:1486:1: rule__PrivateNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__PrivateNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1490:1: ( ( 'parts' ) )
            // InternalComponentInterface.g:1491:1: ( 'parts' )
            {
            // InternalComponentInterface.g:1491:1: ( 'parts' )
            // InternalComponentInterface.g:1492:2: 'parts'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__1"
    // InternalComponentInterface.g:1501:1: rule__PrivateNamespace__Group_3__1 : rule__PrivateNamespace__Group_3__1__Impl ;
    public final void rule__PrivateNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1505:1: ( rule__PrivateNamespace__Group_3__1__Impl )
            // InternalComponentInterface.g:1506:2: rule__PrivateNamespace__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__1"


    // $ANTLR start "rule__PrivateNamespace__Group_3__1__Impl"
    // InternalComponentInterface.g:1512:1: rule__PrivateNamespace__Group_3__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_1 ) ) ;
    public final void rule__PrivateNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1516:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_1 ) ) )
            // InternalComponentInterface.g:1517:1: ( ( rule__PrivateNamespace__PartsAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:1517:1: ( ( rule__PrivateNamespace__PartsAssignment_3_1 ) )
            // InternalComponentInterface.g:1518:2: ( rule__PrivateNamespace__PartsAssignment_3_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_1()); 
            // InternalComponentInterface.g:1519:2: ( rule__PrivateNamespace__PartsAssignment_3_1 )
            // InternalComponentInterface.g:1519:3: rule__PrivateNamespace__PartsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__1__Impl"


    // $ANTLR start "rule__Publisher__Group__0"
    // InternalComponentInterface.g:1528:1: rule__Publisher__Group__0 : rule__Publisher__Group__0__Impl rule__Publisher__Group__1 ;
    public final void rule__Publisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1532:1: ( rule__Publisher__Group__0__Impl rule__Publisher__Group__1 )
            // InternalComponentInterface.g:1533:2: rule__Publisher__Group__0__Impl rule__Publisher__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Publisher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0"


    // $ANTLR start "rule__Publisher__Group__0__Impl"
    // InternalComponentInterface.g:1540:1: rule__Publisher__Group__0__Impl : ( () ) ;
    public final void rule__Publisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1544:1: ( ( () ) )
            // InternalComponentInterface.g:1545:1: ( () )
            {
            // InternalComponentInterface.g:1545:1: ( () )
            // InternalComponentInterface.g:1546:2: ()
            {
             before(grammarAccess.getPublisherAccess().getPublisherAction_0()); 
            // InternalComponentInterface.g:1547:2: ()
            // InternalComponentInterface.g:1547:3: 
            {
            }

             after(grammarAccess.getPublisherAccess().getPublisherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0__Impl"


    // $ANTLR start "rule__Publisher__Group__1"
    // InternalComponentInterface.g:1555:1: rule__Publisher__Group__1 : rule__Publisher__Group__1__Impl rule__Publisher__Group__2 ;
    public final void rule__Publisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1559:1: ( rule__Publisher__Group__1__Impl rule__Publisher__Group__2 )
            // InternalComponentInterface.g:1560:2: rule__Publisher__Group__1__Impl rule__Publisher__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Publisher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1"


    // $ANTLR start "rule__Publisher__Group__1__Impl"
    // InternalComponentInterface.g:1567:1: rule__Publisher__Group__1__Impl : ( 'Publisher' ) ;
    public final void rule__Publisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1571:1: ( ( 'Publisher' ) )
            // InternalComponentInterface.g:1572:1: ( 'Publisher' )
            {
            // InternalComponentInterface.g:1572:1: ( 'Publisher' )
            // InternalComponentInterface.g:1573:2: 'Publisher'
            {
             before(grammarAccess.getPublisherAccess().getPublisherKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getPublisherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1__Impl"


    // $ANTLR start "rule__Publisher__Group__2"
    // InternalComponentInterface.g:1582:1: rule__Publisher__Group__2 : rule__Publisher__Group__2__Impl rule__Publisher__Group__3 ;
    public final void rule__Publisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1586:1: ( rule__Publisher__Group__2__Impl rule__Publisher__Group__3 )
            // InternalComponentInterface.g:1587:2: rule__Publisher__Group__2__Impl rule__Publisher__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Publisher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2"


    // $ANTLR start "rule__Publisher__Group__2__Impl"
    // InternalComponentInterface.g:1594:1: rule__Publisher__Group__2__Impl : ( '{' ) ;
    public final void rule__Publisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1598:1: ( ( '{' ) )
            // InternalComponentInterface.g:1599:1: ( '{' )
            {
            // InternalComponentInterface.g:1599:1: ( '{' )
            // InternalComponentInterface.g:1600:2: '{'
            {
             before(grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2__Impl"


    // $ANTLR start "rule__Publisher__Group__3"
    // InternalComponentInterface.g:1609:1: rule__Publisher__Group__3 : rule__Publisher__Group__3__Impl rule__Publisher__Group__4 ;
    public final void rule__Publisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1613:1: ( rule__Publisher__Group__3__Impl rule__Publisher__Group__4 )
            // InternalComponentInterface.g:1614:2: rule__Publisher__Group__3__Impl rule__Publisher__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Publisher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3"


    // $ANTLR start "rule__Publisher__Group__3__Impl"
    // InternalComponentInterface.g:1621:1: rule__Publisher__Group__3__Impl : ( ( rule__Publisher__Group_3__0 )? ) ;
    public final void rule__Publisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1625:1: ( ( ( rule__Publisher__Group_3__0 )? ) )
            // InternalComponentInterface.g:1626:1: ( ( rule__Publisher__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1626:1: ( ( rule__Publisher__Group_3__0 )? )
            // InternalComponentInterface.g:1627:2: ( rule__Publisher__Group_3__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_3()); 
            // InternalComponentInterface.g:1628:2: ( rule__Publisher__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:1628:3: rule__Publisher__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Publisher__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublisherAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3__Impl"


    // $ANTLR start "rule__Publisher__Group__4"
    // InternalComponentInterface.g:1636:1: rule__Publisher__Group__4 : rule__Publisher__Group__4__Impl rule__Publisher__Group__5 ;
    public final void rule__Publisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1640:1: ( rule__Publisher__Group__4__Impl rule__Publisher__Group__5 )
            // InternalComponentInterface.g:1641:2: rule__Publisher__Group__4__Impl rule__Publisher__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Publisher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4"


    // $ANTLR start "rule__Publisher__Group__4__Impl"
    // InternalComponentInterface.g:1648:1: rule__Publisher__Group__4__Impl : ( ( rule__Publisher__Group_4__0 )? ) ;
    public final void rule__Publisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1652:1: ( ( ( rule__Publisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:1653:1: ( ( rule__Publisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:1653:1: ( ( rule__Publisher__Group_4__0 )? )
            // InternalComponentInterface.g:1654:2: ( rule__Publisher__Group_4__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:1655:2: ( rule__Publisher__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:1655:3: rule__Publisher__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Publisher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublisherAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4__Impl"


    // $ANTLR start "rule__Publisher__Group__5"
    // InternalComponentInterface.g:1663:1: rule__Publisher__Group__5 : rule__Publisher__Group__5__Impl rule__Publisher__Group__6 ;
    public final void rule__Publisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1667:1: ( rule__Publisher__Group__5__Impl rule__Publisher__Group__6 )
            // InternalComponentInterface.g:1668:2: rule__Publisher__Group__5__Impl rule__Publisher__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Publisher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5"


    // $ANTLR start "rule__Publisher__Group__5__Impl"
    // InternalComponentInterface.g:1675:1: rule__Publisher__Group__5__Impl : ( ( rule__Publisher__Group_5__0 )? ) ;
    public final void rule__Publisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1679:1: ( ( ( rule__Publisher__Group_5__0 )? ) )
            // InternalComponentInterface.g:1680:1: ( ( rule__Publisher__Group_5__0 )? )
            {
            // InternalComponentInterface.g:1680:1: ( ( rule__Publisher__Group_5__0 )? )
            // InternalComponentInterface.g:1681:2: ( rule__Publisher__Group_5__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_5()); 
            // InternalComponentInterface.g:1682:2: ( rule__Publisher__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:1682:3: rule__Publisher__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Publisher__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublisherAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5__Impl"


    // $ANTLR start "rule__Publisher__Group__6"
    // InternalComponentInterface.g:1690:1: rule__Publisher__Group__6 : rule__Publisher__Group__6__Impl ;
    public final void rule__Publisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1694:1: ( rule__Publisher__Group__6__Impl )
            // InternalComponentInterface.g:1695:2: rule__Publisher__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6"


    // $ANTLR start "rule__Publisher__Group__6__Impl"
    // InternalComponentInterface.g:1701:1: rule__Publisher__Group__6__Impl : ( '}' ) ;
    public final void rule__Publisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1705:1: ( ( '}' ) )
            // InternalComponentInterface.g:1706:1: ( '}' )
            {
            // InternalComponentInterface.g:1706:1: ( '}' )
            // InternalComponentInterface.g:1707:2: '}'
            {
             before(grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6__Impl"


    // $ANTLR start "rule__Publisher__Group_3__0"
    // InternalComponentInterface.g:1717:1: rule__Publisher__Group_3__0 : rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1 ;
    public final void rule__Publisher__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1721:1: ( rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1 )
            // InternalComponentInterface.g:1722:2: rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Publisher__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__0"


    // $ANTLR start "rule__Publisher__Group_3__0__Impl"
    // InternalComponentInterface.g:1729:1: rule__Publisher__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__Publisher__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1733:1: ( ( 'TopicName' ) )
            // InternalComponentInterface.g:1734:1: ( 'TopicName' )
            {
            // InternalComponentInterface.g:1734:1: ( 'TopicName' )
            // InternalComponentInterface.g:1735:2: 'TopicName'
            {
             before(grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__0__Impl"


    // $ANTLR start "rule__Publisher__Group_3__1"
    // InternalComponentInterface.g:1744:1: rule__Publisher__Group_3__1 : rule__Publisher__Group_3__1__Impl ;
    public final void rule__Publisher__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1748:1: ( rule__Publisher__Group_3__1__Impl )
            // InternalComponentInterface.g:1749:2: rule__Publisher__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__1"


    // $ANTLR start "rule__Publisher__Group_3__1__Impl"
    // InternalComponentInterface.g:1755:1: rule__Publisher__Group_3__1__Impl : ( ( rule__Publisher__TopicNameAssignment_3_1 ) ) ;
    public final void rule__Publisher__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1759:1: ( ( ( rule__Publisher__TopicNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:1760:1: ( ( rule__Publisher__TopicNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:1760:1: ( ( rule__Publisher__TopicNameAssignment_3_1 ) )
            // InternalComponentInterface.g:1761:2: ( rule__Publisher__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getPublisherAccess().getTopicNameAssignment_3_1()); 
            // InternalComponentInterface.g:1762:2: ( rule__Publisher__TopicNameAssignment_3_1 )
            // InternalComponentInterface.g:1762:3: rule__Publisher__TopicNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__TopicNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getTopicNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_3__1__Impl"


    // $ANTLR start "rule__Publisher__Group_4__0"
    // InternalComponentInterface.g:1771:1: rule__Publisher__Group_4__0 : rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1 ;
    public final void rule__Publisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1775:1: ( rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1 )
            // InternalComponentInterface.g:1776:2: rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Publisher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__0"


    // $ANTLR start "rule__Publisher__Group_4__0__Impl"
    // InternalComponentInterface.g:1783:1: rule__Publisher__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__Publisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1787:1: ( ( 'TopicRef' ) )
            // InternalComponentInterface.g:1788:1: ( 'TopicRef' )
            {
            // InternalComponentInterface.g:1788:1: ( 'TopicRef' )
            // InternalComponentInterface.g:1789:2: 'TopicRef'
            {
             before(grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__0__Impl"


    // $ANTLR start "rule__Publisher__Group_4__1"
    // InternalComponentInterface.g:1798:1: rule__Publisher__Group_4__1 : rule__Publisher__Group_4__1__Impl ;
    public final void rule__Publisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1802:1: ( rule__Publisher__Group_4__1__Impl )
            // InternalComponentInterface.g:1803:2: rule__Publisher__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__1"


    // $ANTLR start "rule__Publisher__Group_4__1__Impl"
    // InternalComponentInterface.g:1809:1: rule__Publisher__Group_4__1__Impl : ( ( rule__Publisher__TopicRefAssignment_4_1 ) ) ;
    public final void rule__Publisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1813:1: ( ( ( rule__Publisher__TopicRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:1814:1: ( ( rule__Publisher__TopicRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:1814:1: ( ( rule__Publisher__TopicRefAssignment_4_1 ) )
            // InternalComponentInterface.g:1815:2: ( rule__Publisher__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getPublisherAccess().getTopicRefAssignment_4_1()); 
            // InternalComponentInterface.g:1816:2: ( rule__Publisher__TopicRefAssignment_4_1 )
            // InternalComponentInterface.g:1816:3: rule__Publisher__TopicRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__TopicRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getTopicRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_4__1__Impl"


    // $ANTLR start "rule__Publisher__Group_5__0"
    // InternalComponentInterface.g:1825:1: rule__Publisher__Group_5__0 : rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1 ;
    public final void rule__Publisher__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1829:1: ( rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1 )
            // InternalComponentInterface.g:1830:2: rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Publisher__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__0"


    // $ANTLR start "rule__Publisher__Group_5__0__Impl"
    // InternalComponentInterface.g:1837:1: rule__Publisher__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__Publisher__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1841:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:1842:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:1842:1: ( 'NameSpace' )
            // InternalComponentInterface.g:1843:2: 'NameSpace'
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__0__Impl"


    // $ANTLR start "rule__Publisher__Group_5__1"
    // InternalComponentInterface.g:1852:1: rule__Publisher__Group_5__1 : rule__Publisher__Group_5__1__Impl ;
    public final void rule__Publisher__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1856:1: ( rule__Publisher__Group_5__1__Impl )
            // InternalComponentInterface.g:1857:2: rule__Publisher__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__1"


    // $ANTLR start "rule__Publisher__Group_5__1__Impl"
    // InternalComponentInterface.g:1863:1: rule__Publisher__Group_5__1__Impl : ( ( rule__Publisher__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__Publisher__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1867:1: ( ( ( rule__Publisher__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:1868:1: ( ( rule__Publisher__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:1868:1: ( ( rule__Publisher__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:1869:2: ( rule__Publisher__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:1870:2: ( rule__Publisher__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:1870:3: rule__Publisher__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group_5__1__Impl"


    // $ANTLR start "rule__Subscriber__Group__0"
    // InternalComponentInterface.g:1879:1: rule__Subscriber__Group__0 : rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 ;
    public final void rule__Subscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1883:1: ( rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 )
            // InternalComponentInterface.g:1884:2: rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Subscriber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0"


    // $ANTLR start "rule__Subscriber__Group__0__Impl"
    // InternalComponentInterface.g:1891:1: rule__Subscriber__Group__0__Impl : ( () ) ;
    public final void rule__Subscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1895:1: ( ( () ) )
            // InternalComponentInterface.g:1896:1: ( () )
            {
            // InternalComponentInterface.g:1896:1: ( () )
            // InternalComponentInterface.g:1897:2: ()
            {
             before(grammarAccess.getSubscriberAccess().getSubscriberAction_0()); 
            // InternalComponentInterface.g:1898:2: ()
            // InternalComponentInterface.g:1898:3: 
            {
            }

             after(grammarAccess.getSubscriberAccess().getSubscriberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0__Impl"


    // $ANTLR start "rule__Subscriber__Group__1"
    // InternalComponentInterface.g:1906:1: rule__Subscriber__Group__1 : rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 ;
    public final void rule__Subscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1910:1: ( rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 )
            // InternalComponentInterface.g:1911:2: rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Subscriber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1"


    // $ANTLR start "rule__Subscriber__Group__1__Impl"
    // InternalComponentInterface.g:1918:1: rule__Subscriber__Group__1__Impl : ( 'Subscriber' ) ;
    public final void rule__Subscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1922:1: ( ( 'Subscriber' ) )
            // InternalComponentInterface.g:1923:1: ( 'Subscriber' )
            {
            // InternalComponentInterface.g:1923:1: ( 'Subscriber' )
            // InternalComponentInterface.g:1924:2: 'Subscriber'
            {
             before(grammarAccess.getSubscriberAccess().getSubscriberKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getSubscriberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1__Impl"


    // $ANTLR start "rule__Subscriber__Group__2"
    // InternalComponentInterface.g:1933:1: rule__Subscriber__Group__2 : rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 ;
    public final void rule__Subscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1937:1: ( rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 )
            // InternalComponentInterface.g:1938:2: rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Subscriber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2"


    // $ANTLR start "rule__Subscriber__Group__2__Impl"
    // InternalComponentInterface.g:1945:1: rule__Subscriber__Group__2__Impl : ( '{' ) ;
    public final void rule__Subscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1949:1: ( ( '{' ) )
            // InternalComponentInterface.g:1950:1: ( '{' )
            {
            // InternalComponentInterface.g:1950:1: ( '{' )
            // InternalComponentInterface.g:1951:2: '{'
            {
             before(grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2__Impl"


    // $ANTLR start "rule__Subscriber__Group__3"
    // InternalComponentInterface.g:1960:1: rule__Subscriber__Group__3 : rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 ;
    public final void rule__Subscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1964:1: ( rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 )
            // InternalComponentInterface.g:1965:2: rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Subscriber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3"


    // $ANTLR start "rule__Subscriber__Group__3__Impl"
    // InternalComponentInterface.g:1972:1: rule__Subscriber__Group__3__Impl : ( ( rule__Subscriber__Group_3__0 )? ) ;
    public final void rule__Subscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1976:1: ( ( ( rule__Subscriber__Group_3__0 )? ) )
            // InternalComponentInterface.g:1977:1: ( ( rule__Subscriber__Group_3__0 )? )
            {
            // InternalComponentInterface.g:1977:1: ( ( rule__Subscriber__Group_3__0 )? )
            // InternalComponentInterface.g:1978:2: ( rule__Subscriber__Group_3__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_3()); 
            // InternalComponentInterface.g:1979:2: ( rule__Subscriber__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:1979:3: rule__Subscriber__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subscriber__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubscriberAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3__Impl"


    // $ANTLR start "rule__Subscriber__Group__4"
    // InternalComponentInterface.g:1987:1: rule__Subscriber__Group__4 : rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 ;
    public final void rule__Subscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1991:1: ( rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 )
            // InternalComponentInterface.g:1992:2: rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Subscriber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4"


    // $ANTLR start "rule__Subscriber__Group__4__Impl"
    // InternalComponentInterface.g:1999:1: rule__Subscriber__Group__4__Impl : ( ( rule__Subscriber__Group_4__0 )? ) ;
    public final void rule__Subscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2003:1: ( ( ( rule__Subscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:2004:1: ( ( rule__Subscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2004:1: ( ( rule__Subscriber__Group_4__0 )? )
            // InternalComponentInterface.g:2005:2: ( rule__Subscriber__Group_4__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:2006:2: ( rule__Subscriber__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:2006:3: rule__Subscriber__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subscriber__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubscriberAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4__Impl"


    // $ANTLR start "rule__Subscriber__Group__5"
    // InternalComponentInterface.g:2014:1: rule__Subscriber__Group__5 : rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 ;
    public final void rule__Subscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2018:1: ( rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 )
            // InternalComponentInterface.g:2019:2: rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Subscriber__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5"


    // $ANTLR start "rule__Subscriber__Group__5__Impl"
    // InternalComponentInterface.g:2026:1: rule__Subscriber__Group__5__Impl : ( ( rule__Subscriber__Group_5__0 )? ) ;
    public final void rule__Subscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2030:1: ( ( ( rule__Subscriber__Group_5__0 )? ) )
            // InternalComponentInterface.g:2031:1: ( ( rule__Subscriber__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2031:1: ( ( rule__Subscriber__Group_5__0 )? )
            // InternalComponentInterface.g:2032:2: ( rule__Subscriber__Group_5__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_5()); 
            // InternalComponentInterface.g:2033:2: ( rule__Subscriber__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:2033:3: rule__Subscriber__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subscriber__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubscriberAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5__Impl"


    // $ANTLR start "rule__Subscriber__Group__6"
    // InternalComponentInterface.g:2041:1: rule__Subscriber__Group__6 : rule__Subscriber__Group__6__Impl ;
    public final void rule__Subscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2045:1: ( rule__Subscriber__Group__6__Impl )
            // InternalComponentInterface.g:2046:2: rule__Subscriber__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6"


    // $ANTLR start "rule__Subscriber__Group__6__Impl"
    // InternalComponentInterface.g:2052:1: rule__Subscriber__Group__6__Impl : ( '}' ) ;
    public final void rule__Subscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2056:1: ( ( '}' ) )
            // InternalComponentInterface.g:2057:1: ( '}' )
            {
            // InternalComponentInterface.g:2057:1: ( '}' )
            // InternalComponentInterface.g:2058:2: '}'
            {
             before(grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6__Impl"


    // $ANTLR start "rule__Subscriber__Group_3__0"
    // InternalComponentInterface.g:2068:1: rule__Subscriber__Group_3__0 : rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1 ;
    public final void rule__Subscriber__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2072:1: ( rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1 )
            // InternalComponentInterface.g:2073:2: rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Subscriber__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__0"


    // $ANTLR start "rule__Subscriber__Group_3__0__Impl"
    // InternalComponentInterface.g:2080:1: rule__Subscriber__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__Subscriber__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2084:1: ( ( 'TopicName' ) )
            // InternalComponentInterface.g:2085:1: ( 'TopicName' )
            {
            // InternalComponentInterface.g:2085:1: ( 'TopicName' )
            // InternalComponentInterface.g:2086:2: 'TopicName'
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__0__Impl"


    // $ANTLR start "rule__Subscriber__Group_3__1"
    // InternalComponentInterface.g:2095:1: rule__Subscriber__Group_3__1 : rule__Subscriber__Group_3__1__Impl ;
    public final void rule__Subscriber__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2099:1: ( rule__Subscriber__Group_3__1__Impl )
            // InternalComponentInterface.g:2100:2: rule__Subscriber__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__1"


    // $ANTLR start "rule__Subscriber__Group_3__1__Impl"
    // InternalComponentInterface.g:2106:1: rule__Subscriber__Group_3__1__Impl : ( ( rule__Subscriber__TopicNameAssignment_3_1 ) ) ;
    public final void rule__Subscriber__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2110:1: ( ( ( rule__Subscriber__TopicNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2111:1: ( ( rule__Subscriber__TopicNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2111:1: ( ( rule__Subscriber__TopicNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2112:2: ( rule__Subscriber__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameAssignment_3_1()); 
            // InternalComponentInterface.g:2113:2: ( rule__Subscriber__TopicNameAssignment_3_1 )
            // InternalComponentInterface.g:2113:3: rule__Subscriber__TopicNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__TopicNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getTopicNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_3__1__Impl"


    // $ANTLR start "rule__Subscriber__Group_4__0"
    // InternalComponentInterface.g:2122:1: rule__Subscriber__Group_4__0 : rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1 ;
    public final void rule__Subscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2126:1: ( rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1 )
            // InternalComponentInterface.g:2127:2: rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Subscriber__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__0"


    // $ANTLR start "rule__Subscriber__Group_4__0__Impl"
    // InternalComponentInterface.g:2134:1: rule__Subscriber__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__Subscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2138:1: ( ( 'TopicRef' ) )
            // InternalComponentInterface.g:2139:1: ( 'TopicRef' )
            {
            // InternalComponentInterface.g:2139:1: ( 'TopicRef' )
            // InternalComponentInterface.g:2140:2: 'TopicRef'
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__0__Impl"


    // $ANTLR start "rule__Subscriber__Group_4__1"
    // InternalComponentInterface.g:2149:1: rule__Subscriber__Group_4__1 : rule__Subscriber__Group_4__1__Impl ;
    public final void rule__Subscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2153:1: ( rule__Subscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:2154:2: rule__Subscriber__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__1"


    // $ANTLR start "rule__Subscriber__Group_4__1__Impl"
    // InternalComponentInterface.g:2160:1: rule__Subscriber__Group_4__1__Impl : ( ( rule__Subscriber__TopicRefAssignment_4_1 ) ) ;
    public final void rule__Subscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2164:1: ( ( ( rule__Subscriber__TopicRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2165:1: ( ( rule__Subscriber__TopicRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2165:1: ( ( rule__Subscriber__TopicRefAssignment_4_1 ) )
            // InternalComponentInterface.g:2166:2: ( rule__Subscriber__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefAssignment_4_1()); 
            // InternalComponentInterface.g:2167:2: ( rule__Subscriber__TopicRefAssignment_4_1 )
            // InternalComponentInterface.g:2167:3: rule__Subscriber__TopicRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__TopicRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getTopicRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_4__1__Impl"


    // $ANTLR start "rule__Subscriber__Group_5__0"
    // InternalComponentInterface.g:2176:1: rule__Subscriber__Group_5__0 : rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1 ;
    public final void rule__Subscriber__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2180:1: ( rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1 )
            // InternalComponentInterface.g:2181:2: rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Subscriber__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__0"


    // $ANTLR start "rule__Subscriber__Group_5__0__Impl"
    // InternalComponentInterface.g:2188:1: rule__Subscriber__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__Subscriber__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2192:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:2193:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:2193:1: ( 'NameSpace' )
            // InternalComponentInterface.g:2194:2: 'NameSpace'
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__0__Impl"


    // $ANTLR start "rule__Subscriber__Group_5__1"
    // InternalComponentInterface.g:2203:1: rule__Subscriber__Group_5__1 : rule__Subscriber__Group_5__1__Impl ;
    public final void rule__Subscriber__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2207:1: ( rule__Subscriber__Group_5__1__Impl )
            // InternalComponentInterface.g:2208:2: rule__Subscriber__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__1"


    // $ANTLR start "rule__Subscriber__Group_5__1__Impl"
    // InternalComponentInterface.g:2214:1: rule__Subscriber__Group_5__1__Impl : ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__Subscriber__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2218:1: ( ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:2219:1: ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:2219:1: ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:2220:2: ( rule__Subscriber__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:2221:2: ( rule__Subscriber__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:2221:3: rule__Subscriber__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group_5__1__Impl"


    // $ANTLR start "rule__MessageDefinition__Group__0"
    // InternalComponentInterface.g:2230:1: rule__MessageDefinition__Group__0 : rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 ;
    public final void rule__MessageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2234:1: ( rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 )
            // InternalComponentInterface.g:2235:2: rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MessageDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__0"


    // $ANTLR start "rule__MessageDefinition__Group__0__Impl"
    // InternalComponentInterface.g:2242:1: rule__MessageDefinition__Group__0__Impl : ( () ) ;
    public final void rule__MessageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2246:1: ( ( () ) )
            // InternalComponentInterface.g:2247:1: ( () )
            {
            // InternalComponentInterface.g:2247:1: ( () )
            // InternalComponentInterface.g:2248:2: ()
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0()); 
            // InternalComponentInterface.g:2249:2: ()
            // InternalComponentInterface.g:2249:3: 
            {
            }

             after(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__0__Impl"


    // $ANTLR start "rule__MessageDefinition__Group__1"
    // InternalComponentInterface.g:2257:1: rule__MessageDefinition__Group__1 : rule__MessageDefinition__Group__1__Impl ;
    public final void rule__MessageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2261:1: ( rule__MessageDefinition__Group__1__Impl )
            // InternalComponentInterface.g:2262:2: rule__MessageDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MessageDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__1"


    // $ANTLR start "rule__MessageDefinition__Group__1__Impl"
    // InternalComponentInterface.g:2268:1: rule__MessageDefinition__Group__1__Impl : ( 'MessageDefinition' ) ;
    public final void rule__MessageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2272:1: ( ( 'MessageDefinition' ) )
            // InternalComponentInterface.g:2273:1: ( 'MessageDefinition' )
            {
            // InternalComponentInterface.g:2273:1: ( 'MessageDefinition' )
            // InternalComponentInterface.g:2274:2: 'MessageDefinition'
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageDefinition__Group__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group__0"
    // InternalComponentInterface.g:2284:1: rule__ServiceServer__Group__0 : rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1 ;
    public final void rule__ServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2288:1: ( rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1 )
            // InternalComponentInterface.g:2289:2: rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ServiceServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__0"


    // $ANTLR start "rule__ServiceServer__Group__0__Impl"
    // InternalComponentInterface.g:2296:1: rule__ServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__ServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2300:1: ( ( () ) )
            // InternalComponentInterface.g:2301:1: ( () )
            {
            // InternalComponentInterface.g:2301:1: ( () )
            // InternalComponentInterface.g:2302:2: ()
            {
             before(grammarAccess.getServiceServerAccess().getServiceServerAction_0()); 
            // InternalComponentInterface.g:2303:2: ()
            // InternalComponentInterface.g:2303:3: 
            {
            }

             after(grammarAccess.getServiceServerAccess().getServiceServerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group__1"
    // InternalComponentInterface.g:2311:1: rule__ServiceServer__Group__1 : rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2 ;
    public final void rule__ServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2315:1: ( rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2 )
            // InternalComponentInterface.g:2316:2: rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__1"


    // $ANTLR start "rule__ServiceServer__Group__1__Impl"
    // InternalComponentInterface.g:2323:1: rule__ServiceServer__Group__1__Impl : ( 'ServiceServer' ) ;
    public final void rule__ServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2327:1: ( ( 'ServiceServer' ) )
            // InternalComponentInterface.g:2328:1: ( 'ServiceServer' )
            {
            // InternalComponentInterface.g:2328:1: ( 'ServiceServer' )
            // InternalComponentInterface.g:2329:2: 'ServiceServer'
            {
             before(grammarAccess.getServiceServerAccess().getServiceServerKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getServiceServerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group__2"
    // InternalComponentInterface.g:2338:1: rule__ServiceServer__Group__2 : rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3 ;
    public final void rule__ServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2342:1: ( rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3 )
            // InternalComponentInterface.g:2343:2: rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ServiceServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__2"


    // $ANTLR start "rule__ServiceServer__Group__2__Impl"
    // InternalComponentInterface.g:2350:1: rule__ServiceServer__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2354:1: ( ( '{' ) )
            // InternalComponentInterface.g:2355:1: ( '{' )
            {
            // InternalComponentInterface.g:2355:1: ( '{' )
            // InternalComponentInterface.g:2356:2: '{'
            {
             before(grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__2__Impl"


    // $ANTLR start "rule__ServiceServer__Group__3"
    // InternalComponentInterface.g:2365:1: rule__ServiceServer__Group__3 : rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4 ;
    public final void rule__ServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2369:1: ( rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4 )
            // InternalComponentInterface.g:2370:2: rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ServiceServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__3"


    // $ANTLR start "rule__ServiceServer__Group__3__Impl"
    // InternalComponentInterface.g:2377:1: rule__ServiceServer__Group__3__Impl : ( ( rule__ServiceServer__Group_3__0 )? ) ;
    public final void rule__ServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2381:1: ( ( ( rule__ServiceServer__Group_3__0 )? ) )
            // InternalComponentInterface.g:2382:1: ( ( rule__ServiceServer__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2382:1: ( ( rule__ServiceServer__Group_3__0 )? )
            // InternalComponentInterface.g:2383:2: ( rule__ServiceServer__Group_3__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_3()); 
            // InternalComponentInterface.g:2384:2: ( rule__ServiceServer__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:2384:3: rule__ServiceServer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceServer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceServerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__3__Impl"


    // $ANTLR start "rule__ServiceServer__Group__4"
    // InternalComponentInterface.g:2392:1: rule__ServiceServer__Group__4 : rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5 ;
    public final void rule__ServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2396:1: ( rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5 )
            // InternalComponentInterface.g:2397:2: rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ServiceServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__4"


    // $ANTLR start "rule__ServiceServer__Group__4__Impl"
    // InternalComponentInterface.g:2404:1: rule__ServiceServer__Group__4__Impl : ( ( rule__ServiceServer__Group_4__0 )? ) ;
    public final void rule__ServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2408:1: ( ( ( rule__ServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2409:1: ( ( rule__ServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2409:1: ( ( rule__ServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:2410:2: ( rule__ServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2411:2: ( rule__ServiceServer__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:2411:3: rule__ServiceServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__4__Impl"


    // $ANTLR start "rule__ServiceServer__Group__5"
    // InternalComponentInterface.g:2419:1: rule__ServiceServer__Group__5 : rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6 ;
    public final void rule__ServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2423:1: ( rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6 )
            // InternalComponentInterface.g:2424:2: rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ServiceServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__5"


    // $ANTLR start "rule__ServiceServer__Group__5__Impl"
    // InternalComponentInterface.g:2431:1: rule__ServiceServer__Group__5__Impl : ( ( rule__ServiceServer__Group_5__0 )? ) ;
    public final void rule__ServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2435:1: ( ( ( rule__ServiceServer__Group_5__0 )? ) )
            // InternalComponentInterface.g:2436:1: ( ( rule__ServiceServer__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2436:1: ( ( rule__ServiceServer__Group_5__0 )? )
            // InternalComponentInterface.g:2437:2: ( rule__ServiceServer__Group_5__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_5()); 
            // InternalComponentInterface.g:2438:2: ( rule__ServiceServer__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:2438:3: rule__ServiceServer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceServer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceServerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__5__Impl"


    // $ANTLR start "rule__ServiceServer__Group__6"
    // InternalComponentInterface.g:2446:1: rule__ServiceServer__Group__6 : rule__ServiceServer__Group__6__Impl ;
    public final void rule__ServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2450:1: ( rule__ServiceServer__Group__6__Impl )
            // InternalComponentInterface.g:2451:2: rule__ServiceServer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__6"


    // $ANTLR start "rule__ServiceServer__Group__6__Impl"
    // InternalComponentInterface.g:2457:1: rule__ServiceServer__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2461:1: ( ( '}' ) )
            // InternalComponentInterface.g:2462:1: ( '}' )
            {
            // InternalComponentInterface.g:2462:1: ( '}' )
            // InternalComponentInterface.g:2463:2: '}'
            {
             before(grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group__6__Impl"


    // $ANTLR start "rule__ServiceServer__Group_3__0"
    // InternalComponentInterface.g:2473:1: rule__ServiceServer__Group_3__0 : rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1 ;
    public final void rule__ServiceServer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2477:1: ( rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1 )
            // InternalComponentInterface.g:2478:2: rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceServer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__0"


    // $ANTLR start "rule__ServiceServer__Group_3__0__Impl"
    // InternalComponentInterface.g:2485:1: rule__ServiceServer__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__ServiceServer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2489:1: ( ( 'ServiceName' ) )
            // InternalComponentInterface.g:2490:1: ( 'ServiceName' )
            {
            // InternalComponentInterface.g:2490:1: ( 'ServiceName' )
            // InternalComponentInterface.g:2491:2: 'ServiceName'
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group_3__1"
    // InternalComponentInterface.g:2500:1: rule__ServiceServer__Group_3__1 : rule__ServiceServer__Group_3__1__Impl ;
    public final void rule__ServiceServer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2504:1: ( rule__ServiceServer__Group_3__1__Impl )
            // InternalComponentInterface.g:2505:2: rule__ServiceServer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__1"


    // $ANTLR start "rule__ServiceServer__Group_3__1__Impl"
    // InternalComponentInterface.g:2511:1: rule__ServiceServer__Group_3__1__Impl : ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__ServiceServer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2515:1: ( ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2516:1: ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2516:1: ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2517:2: ( rule__ServiceServer__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameAssignment_3_1()); 
            // InternalComponentInterface.g:2518:2: ( rule__ServiceServer__ServiceNameAssignment_3_1 )
            // InternalComponentInterface.g:2518:3: rule__ServiceServer__ServiceNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__ServiceNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getServiceNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_3__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group_4__0"
    // InternalComponentInterface.g:2527:1: rule__ServiceServer__Group_4__0 : rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1 ;
    public final void rule__ServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2531:1: ( rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1 )
            // InternalComponentInterface.g:2532:2: rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__0"


    // $ANTLR start "rule__ServiceServer__Group_4__0__Impl"
    // InternalComponentInterface.g:2539:1: rule__ServiceServer__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__ServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2543:1: ( ( 'SrvRef' ) )
            // InternalComponentInterface.g:2544:1: ( 'SrvRef' )
            {
            // InternalComponentInterface.g:2544:1: ( 'SrvRef' )
            // InternalComponentInterface.g:2545:2: 'SrvRef'
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group_4__1"
    // InternalComponentInterface.g:2554:1: rule__ServiceServer__Group_4__1 : rule__ServiceServer__Group_4__1__Impl ;
    public final void rule__ServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2558:1: ( rule__ServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:2559:2: rule__ServiceServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__1"


    // $ANTLR start "rule__ServiceServer__Group_4__1__Impl"
    // InternalComponentInterface.g:2565:1: rule__ServiceServer__Group_4__1__Impl : ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) ) ;
    public final void rule__ServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2569:1: ( ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2570:1: ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2570:1: ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) )
            // InternalComponentInterface.g:2571:2: ( rule__ServiceServer__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefAssignment_4_1()); 
            // InternalComponentInterface.g:2572:2: ( rule__ServiceServer__SrvRefAssignment_4_1 )
            // InternalComponentInterface.g:2572:3: rule__ServiceServer__SrvRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__SrvRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getSrvRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_4__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group_5__0"
    // InternalComponentInterface.g:2581:1: rule__ServiceServer__Group_5__0 : rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1 ;
    public final void rule__ServiceServer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2585:1: ( rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1 )
            // InternalComponentInterface.g:2586:2: rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceServer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__0"


    // $ANTLR start "rule__ServiceServer__Group_5__0__Impl"
    // InternalComponentInterface.g:2593:1: rule__ServiceServer__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ServiceServer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2597:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:2598:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:2598:1: ( 'NameSpace' )
            // InternalComponentInterface.g:2599:2: 'NameSpace'
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceServer__Group_5__1"
    // InternalComponentInterface.g:2608:1: rule__ServiceServer__Group_5__1 : rule__ServiceServer__Group_5__1__Impl ;
    public final void rule__ServiceServer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2612:1: ( rule__ServiceServer__Group_5__1__Impl )
            // InternalComponentInterface.g:2613:2: rule__ServiceServer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__1"


    // $ANTLR start "rule__ServiceServer__Group_5__1__Impl"
    // InternalComponentInterface.g:2619:1: rule__ServiceServer__Group_5__1__Impl : ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__ServiceServer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2623:1: ( ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:2624:1: ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:2624:1: ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:2625:2: ( rule__ServiceServer__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:2626:2: ( rule__ServiceServer__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:2626:3: rule__ServiceServer__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceServer__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceServerAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__Group_5__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group__0"
    // InternalComponentInterface.g:2635:1: rule__ServiceClient__Group__0 : rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 ;
    public final void rule__ServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2639:1: ( rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 )
            // InternalComponentInterface.g:2640:2: rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ServiceClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__0"


    // $ANTLR start "rule__ServiceClient__Group__0__Impl"
    // InternalComponentInterface.g:2647:1: rule__ServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__ServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2651:1: ( ( () ) )
            // InternalComponentInterface.g:2652:1: ( () )
            {
            // InternalComponentInterface.g:2652:1: ( () )
            // InternalComponentInterface.g:2653:2: ()
            {
             before(grammarAccess.getServiceClientAccess().getServiceClientAction_0()); 
            // InternalComponentInterface.g:2654:2: ()
            // InternalComponentInterface.g:2654:3: 
            {
            }

             after(grammarAccess.getServiceClientAccess().getServiceClientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group__1"
    // InternalComponentInterface.g:2662:1: rule__ServiceClient__Group__1 : rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 ;
    public final void rule__ServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2666:1: ( rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 )
            // InternalComponentInterface.g:2667:2: rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__1"


    // $ANTLR start "rule__ServiceClient__Group__1__Impl"
    // InternalComponentInterface.g:2674:1: rule__ServiceClient__Group__1__Impl : ( 'ServiceClient' ) ;
    public final void rule__ServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2678:1: ( ( 'ServiceClient' ) )
            // InternalComponentInterface.g:2679:1: ( 'ServiceClient' )
            {
            // InternalComponentInterface.g:2679:1: ( 'ServiceClient' )
            // InternalComponentInterface.g:2680:2: 'ServiceClient'
            {
             before(grammarAccess.getServiceClientAccess().getServiceClientKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getServiceClientKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group__2"
    // InternalComponentInterface.g:2689:1: rule__ServiceClient__Group__2 : rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 ;
    public final void rule__ServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2693:1: ( rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 )
            // InternalComponentInterface.g:2694:2: rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ServiceClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__2"


    // $ANTLR start "rule__ServiceClient__Group__2__Impl"
    // InternalComponentInterface.g:2701:1: rule__ServiceClient__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2705:1: ( ( '{' ) )
            // InternalComponentInterface.g:2706:1: ( '{' )
            {
            // InternalComponentInterface.g:2706:1: ( '{' )
            // InternalComponentInterface.g:2707:2: '{'
            {
             before(grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__2__Impl"


    // $ANTLR start "rule__ServiceClient__Group__3"
    // InternalComponentInterface.g:2716:1: rule__ServiceClient__Group__3 : rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 ;
    public final void rule__ServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2720:1: ( rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 )
            // InternalComponentInterface.g:2721:2: rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ServiceClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__3"


    // $ANTLR start "rule__ServiceClient__Group__3__Impl"
    // InternalComponentInterface.g:2728:1: rule__ServiceClient__Group__3__Impl : ( ( rule__ServiceClient__Group_3__0 )? ) ;
    public final void rule__ServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2732:1: ( ( ( rule__ServiceClient__Group_3__0 )? ) )
            // InternalComponentInterface.g:2733:1: ( ( rule__ServiceClient__Group_3__0 )? )
            {
            // InternalComponentInterface.g:2733:1: ( ( rule__ServiceClient__Group_3__0 )? )
            // InternalComponentInterface.g:2734:2: ( rule__ServiceClient__Group_3__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_3()); 
            // InternalComponentInterface.g:2735:2: ( rule__ServiceClient__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:2735:3: rule__ServiceClient__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceClient__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceClientAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__3__Impl"


    // $ANTLR start "rule__ServiceClient__Group__4"
    // InternalComponentInterface.g:2743:1: rule__ServiceClient__Group__4 : rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 ;
    public final void rule__ServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2747:1: ( rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 )
            // InternalComponentInterface.g:2748:2: rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ServiceClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__4"


    // $ANTLR start "rule__ServiceClient__Group__4__Impl"
    // InternalComponentInterface.g:2755:1: rule__ServiceClient__Group__4__Impl : ( ( rule__ServiceClient__Group_4__0 )? ) ;
    public final void rule__ServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2759:1: ( ( ( rule__ServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:2760:1: ( ( rule__ServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2760:1: ( ( rule__ServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:2761:2: ( rule__ServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:2762:2: ( rule__ServiceClient__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:2762:3: rule__ServiceClient__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceClient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceClientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__4__Impl"


    // $ANTLR start "rule__ServiceClient__Group__5"
    // InternalComponentInterface.g:2770:1: rule__ServiceClient__Group__5 : rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 ;
    public final void rule__ServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2774:1: ( rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 )
            // InternalComponentInterface.g:2775:2: rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ServiceClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__5"


    // $ANTLR start "rule__ServiceClient__Group__5__Impl"
    // InternalComponentInterface.g:2782:1: rule__ServiceClient__Group__5__Impl : ( ( rule__ServiceClient__Group_5__0 )? ) ;
    public final void rule__ServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2786:1: ( ( ( rule__ServiceClient__Group_5__0 )? ) )
            // InternalComponentInterface.g:2787:1: ( ( rule__ServiceClient__Group_5__0 )? )
            {
            // InternalComponentInterface.g:2787:1: ( ( rule__ServiceClient__Group_5__0 )? )
            // InternalComponentInterface.g:2788:2: ( rule__ServiceClient__Group_5__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_5()); 
            // InternalComponentInterface.g:2789:2: ( rule__ServiceClient__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:2789:3: rule__ServiceClient__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceClient__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceClientAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__5__Impl"


    // $ANTLR start "rule__ServiceClient__Group__6"
    // InternalComponentInterface.g:2797:1: rule__ServiceClient__Group__6 : rule__ServiceClient__Group__6__Impl ;
    public final void rule__ServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2801:1: ( rule__ServiceClient__Group__6__Impl )
            // InternalComponentInterface.g:2802:2: rule__ServiceClient__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__6"


    // $ANTLR start "rule__ServiceClient__Group__6__Impl"
    // InternalComponentInterface.g:2808:1: rule__ServiceClient__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2812:1: ( ( '}' ) )
            // InternalComponentInterface.g:2813:1: ( '}' )
            {
            // InternalComponentInterface.g:2813:1: ( '}' )
            // InternalComponentInterface.g:2814:2: '}'
            {
             before(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group__6__Impl"


    // $ANTLR start "rule__ServiceClient__Group_3__0"
    // InternalComponentInterface.g:2824:1: rule__ServiceClient__Group_3__0 : rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1 ;
    public final void rule__ServiceClient__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2828:1: ( rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1 )
            // InternalComponentInterface.g:2829:2: rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceClient__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__0"


    // $ANTLR start "rule__ServiceClient__Group_3__0__Impl"
    // InternalComponentInterface.g:2836:1: rule__ServiceClient__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__ServiceClient__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2840:1: ( ( 'ServiceName' ) )
            // InternalComponentInterface.g:2841:1: ( 'ServiceName' )
            {
            // InternalComponentInterface.g:2841:1: ( 'ServiceName' )
            // InternalComponentInterface.g:2842:2: 'ServiceName'
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group_3__1"
    // InternalComponentInterface.g:2851:1: rule__ServiceClient__Group_3__1 : rule__ServiceClient__Group_3__1__Impl ;
    public final void rule__ServiceClient__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2855:1: ( rule__ServiceClient__Group_3__1__Impl )
            // InternalComponentInterface.g:2856:2: rule__ServiceClient__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__1"


    // $ANTLR start "rule__ServiceClient__Group_3__1__Impl"
    // InternalComponentInterface.g:2862:1: rule__ServiceClient__Group_3__1__Impl : ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__ServiceClient__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2866:1: ( ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) ) )
            // InternalComponentInterface.g:2867:1: ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) )
            {
            // InternalComponentInterface.g:2867:1: ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) )
            // InternalComponentInterface.g:2868:2: ( rule__ServiceClient__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameAssignment_3_1()); 
            // InternalComponentInterface.g:2869:2: ( rule__ServiceClient__ServiceNameAssignment_3_1 )
            // InternalComponentInterface.g:2869:3: rule__ServiceClient__ServiceNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__ServiceNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getServiceNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_3__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group_4__0"
    // InternalComponentInterface.g:2878:1: rule__ServiceClient__Group_4__0 : rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1 ;
    public final void rule__ServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2882:1: ( rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1 )
            // InternalComponentInterface.g:2883:2: rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceClient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__0"


    // $ANTLR start "rule__ServiceClient__Group_4__0__Impl"
    // InternalComponentInterface.g:2890:1: rule__ServiceClient__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__ServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2894:1: ( ( 'SrvRef' ) )
            // InternalComponentInterface.g:2895:1: ( 'SrvRef' )
            {
            // InternalComponentInterface.g:2895:1: ( 'SrvRef' )
            // InternalComponentInterface.g:2896:2: 'SrvRef'
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group_4__1"
    // InternalComponentInterface.g:2905:1: rule__ServiceClient__Group_4__1 : rule__ServiceClient__Group_4__1__Impl ;
    public final void rule__ServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2909:1: ( rule__ServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:2910:2: rule__ServiceClient__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__1"


    // $ANTLR start "rule__ServiceClient__Group_4__1__Impl"
    // InternalComponentInterface.g:2916:1: rule__ServiceClient__Group_4__1__Impl : ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) ) ;
    public final void rule__ServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2920:1: ( ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2921:1: ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2921:1: ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) )
            // InternalComponentInterface.g:2922:2: ( rule__ServiceClient__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefAssignment_4_1()); 
            // InternalComponentInterface.g:2923:2: ( rule__ServiceClient__SrvRefAssignment_4_1 )
            // InternalComponentInterface.g:2923:3: rule__ServiceClient__SrvRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__SrvRefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getSrvRefAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_4__1__Impl"


    // $ANTLR start "rule__ServiceClient__Group_5__0"
    // InternalComponentInterface.g:2932:1: rule__ServiceClient__Group_5__0 : rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1 ;
    public final void rule__ServiceClient__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2936:1: ( rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1 )
            // InternalComponentInterface.g:2937:2: rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceClient__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__0"


    // $ANTLR start "rule__ServiceClient__Group_5__0__Impl"
    // InternalComponentInterface.g:2944:1: rule__ServiceClient__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ServiceClient__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2948:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:2949:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:2949:1: ( 'NameSpace' )
            // InternalComponentInterface.g:2950:2: 'NameSpace'
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceClient__Group_5__1"
    // InternalComponentInterface.g:2959:1: rule__ServiceClient__Group_5__1 : rule__ServiceClient__Group_5__1__Impl ;
    public final void rule__ServiceClient__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2963:1: ( rule__ServiceClient__Group_5__1__Impl )
            // InternalComponentInterface.g:2964:2: rule__ServiceClient__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__1"


    // $ANTLR start "rule__ServiceClient__Group_5__1__Impl"
    // InternalComponentInterface.g:2970:1: rule__ServiceClient__Group_5__1__Impl : ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__ServiceClient__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2974:1: ( ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) ) )
            // InternalComponentInterface.g:2975:1: ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) )
            {
            // InternalComponentInterface.g:2975:1: ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) )
            // InternalComponentInterface.g:2976:2: ( rule__ServiceClient__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceAssignment_5_1()); 
            // InternalComponentInterface.g:2977:2: ( rule__ServiceClient__NameSpaceAssignment_5_1 )
            // InternalComponentInterface.g:2977:3: rule__ServiceClient__NameSpaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceClient__NameSpaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceClientAccess().getNameSpaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_3"
    // InternalComponentInterface.g:2986:1: rule__ComponentInterface__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2990:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:2991:2: ( ruleEString )
            {
            // InternalComponentInterface.g:2991:2: ( ruleEString )
            // InternalComponentInterface.g:2992:3: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NameAssignment_3"


    // $ANTLR start "rule__ComponentInterface__NamespaceAssignment_4_1"
    // InternalComponentInterface.g:3001:1: rule__ComponentInterface__NamespaceAssignment_4_1 : ( ruleNamespace ) ;
    public final void rule__ComponentInterface__NamespaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3005:1: ( ( ruleNamespace ) )
            // InternalComponentInterface.g:3006:2: ( ruleNamespace )
            {
            // InternalComponentInterface.g:3006:2: ( ruleNamespace )
            // InternalComponentInterface.g:3007:3: ruleNamespace
            {
             before(grammarAccess.getComponentInterfaceAccess().getNamespaceNamespaceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNamespaceNamespaceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NamespaceAssignment_4_1"


    // $ANTLR start "rule__ComponentInterface__RosTopicPublisherAssignment_5_1"
    // InternalComponentInterface.g:3016:1: rule__ComponentInterface__RosTopicPublisherAssignment_5_1 : ( rulePublisher ) ;
    public final void rule__ComponentInterface__RosTopicPublisherAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3020:1: ( ( rulePublisher ) )
            // InternalComponentInterface.g:3021:2: ( rulePublisher )
            {
            // InternalComponentInterface.g:3021:2: ( rulePublisher )
            // InternalComponentInterface.g:3022:3: rulePublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherPublisherParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherPublisherParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicPublisherAssignment_5_1"


    // $ANTLR start "rule__ComponentInterface__RosTopicSubscriberAssignment_6_1"
    // InternalComponentInterface.g:3031:1: rule__ComponentInterface__RosTopicSubscriberAssignment_6_1 : ( ruleSubscriber ) ;
    public final void rule__ComponentInterface__RosTopicSubscriberAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3035:1: ( ( ruleSubscriber ) )
            // InternalComponentInterface.g:3036:2: ( ruleSubscriber )
            {
            // InternalComponentInterface.g:3036:2: ( ruleSubscriber )
            // InternalComponentInterface.g:3037:3: ruleSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberSubscriberParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberSubscriberParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosTopicSubscriberAssignment_6_1"


    // $ANTLR start "rule__ComponentInterface__RosServiceServerAssignment_7_1"
    // InternalComponentInterface.g:3046:1: rule__ComponentInterface__RosServiceServerAssignment_7_1 : ( ruleServiceServer ) ;
    public final void rule__ComponentInterface__RosServiceServerAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3050:1: ( ( ruleServiceServer ) )
            // InternalComponentInterface.g:3051:2: ( ruleServiceServer )
            {
            // InternalComponentInterface.g:3051:2: ( ruleServiceServer )
            // InternalComponentInterface.g:3052:3: ruleServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceServerServiceServerParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceServerServiceServerParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceServerAssignment_7_1"


    // $ANTLR start "rule__ComponentInterface__RosServiceClientAssignment_8_1"
    // InternalComponentInterface.g:3061:1: rule__ComponentInterface__RosServiceClientAssignment_8_1 : ( ruleServiceClient ) ;
    public final void rule__ComponentInterface__RosServiceClientAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3065:1: ( ( ruleServiceClient ) )
            // InternalComponentInterface.g:3066:2: ( ruleServiceClient )
            {
            // InternalComponentInterface.g:3066:2: ( ruleServiceClient )
            // InternalComponentInterface.g:3067:3: ruleServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosServiceClientServiceClientParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosServiceClientServiceClientParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosServiceClientAssignment_8_1"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_1"
    // InternalComponentInterface.g:3076:1: rule__GlobalNamespace__PartsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3080:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3081:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3081:2: ( ruleEString )
            // InternalComponentInterface.g:3082:3: ruleEString
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_3_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_3_1"
    // InternalComponentInterface.g:3091:1: rule__RelativeNamespace_Impl__PartsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3095:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3096:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3096:2: ( ruleEString )
            // InternalComponentInterface.g:3097:3: ruleEString
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_3_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_3_1"
    // InternalComponentInterface.g:3106:1: rule__PrivateNamespace__PartsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3110:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3111:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3111:2: ( ruleEString )
            // InternalComponentInterface.g:3112:3: ruleEString
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_3_1"


    // $ANTLR start "rule__Publisher__TopicNameAssignment_3_1"
    // InternalComponentInterface.g:3121:1: rule__Publisher__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Publisher__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3125:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3126:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3126:2: ( ruleEString )
            // InternalComponentInterface.g:3127:3: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__TopicNameAssignment_3_1"


    // $ANTLR start "rule__Publisher__TopicRefAssignment_4_1"
    // InternalComponentInterface.g:3136:1: rule__Publisher__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3140:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3141:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3141:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3142:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3143:3: ( ruleEString )
            // InternalComponentInterface.g:3144:4: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getTopicRefPublisherEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getTopicRefPublisherEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__TopicRefAssignment_4_1"


    // $ANTLR start "rule__Publisher__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3155:1: rule__Publisher__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3159:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3160:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3160:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3161:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalComponentInterface.g:3162:3: ( ruleEString )
            // InternalComponentInterface.g:3163:4: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getPublisherAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__Subscriber__TopicNameAssignment_3_1"
    // InternalComponentInterface.g:3174:1: rule__Subscriber__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subscriber__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3178:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3179:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3179:2: ( ruleEString )
            // InternalComponentInterface.g:3180:3: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__TopicNameAssignment_3_1"


    // $ANTLR start "rule__Subscriber__TopicRefAssignment_4_1"
    // InternalComponentInterface.g:3189:1: rule__Subscriber__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Subscriber__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3193:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3194:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3194:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3195:3: ( ruleEString )
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3196:3: ( ruleEString )
            // InternalComponentInterface.g:3197:4: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefSubscriberEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getTopicRefSubscriberEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__TopicRefAssignment_4_1"


    // $ANTLR start "rule__Subscriber__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3208:1: rule__Subscriber__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Subscriber__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3212:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3213:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3213:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3214:3: ( ruleEString )
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalComponentInterface.g:3215:3: ( ruleEString )
            // InternalComponentInterface.g:3216:4: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getSubscriberAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__ServiceServer__ServiceNameAssignment_3_1"
    // InternalComponentInterface.g:3227:1: rule__ServiceServer__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServiceServer__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3231:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3232:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3232:2: ( ruleEString )
            // InternalComponentInterface.g:3233:3: ruleEString
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__ServiceNameAssignment_3_1"


    // $ANTLR start "rule__ServiceServer__SrvRefAssignment_4_1"
    // InternalComponentInterface.g:3242:1: rule__ServiceServer__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceServer__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3246:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3247:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3247:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3248:3: ( ruleEString )
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3249:3: ( ruleEString )
            // InternalComponentInterface.g:3250:4: ruleEString
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefServiceServerEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceServerAccess().getSrvRefServiceServerEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__SrvRefAssignment_4_1"


    // $ANTLR start "rule__ServiceServer__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3261:1: rule__ServiceServer__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceServer__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3265:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3266:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3266:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3267:3: ( ruleEString )
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalComponentInterface.g:3268:3: ( ruleEString )
            // InternalComponentInterface.g:3269:4: ruleEString
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceServerAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getServiceServerAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceServer__NameSpaceAssignment_5_1"


    // $ANTLR start "rule__ServiceClient__ServiceNameAssignment_3_1"
    // InternalComponentInterface.g:3280:1: rule__ServiceClient__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServiceClient__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3284:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:3285:2: ( ruleEString )
            {
            // InternalComponentInterface.g:3285:2: ( ruleEString )
            // InternalComponentInterface.g:3286:3: ruleEString
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__ServiceNameAssignment_3_1"


    // $ANTLR start "rule__ServiceClient__SrvRefAssignment_4_1"
    // InternalComponentInterface.g:3295:1: rule__ServiceClient__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceClient__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3299:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3300:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3300:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3301:3: ( ruleEString )
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0()); 
            // InternalComponentInterface.g:3302:3: ( ruleEString )
            // InternalComponentInterface.g:3303:4: ruleEString
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefServiceClientEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceClientAccess().getSrvRefServiceClientEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__SrvRefAssignment_4_1"


    // $ANTLR start "rule__ServiceClient__NameSpaceAssignment_5_1"
    // InternalComponentInterface.g:3314:1: rule__ServiceClient__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceClient__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3318:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:3319:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:3319:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:3320:3: ( ruleEString )
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalComponentInterface.g:3321:3: ( ruleEString )
            // InternalComponentInterface.g:3322:4: ruleEString
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceClientAccess().getNameSpaceNamespaceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getServiceClientAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceClient__NameSpaceAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000310008000L});

}