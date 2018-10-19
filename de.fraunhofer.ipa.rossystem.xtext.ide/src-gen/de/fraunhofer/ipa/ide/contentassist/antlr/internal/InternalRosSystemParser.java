package de.fraunhofer.ipa.ide.contentassist.antlr.internal;

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
import de.fraunhofer.ipa.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GraphName'", "'RosSystem'", "'{'", "'}'", "'Name'", "'RosComponent'", "'TopicConnections'", "','", "'ServiceConnections'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'MessageDefinition'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'ServiceServer'", "'ServiceName'", "'SrvRef'", "'ServiceClient'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }


    	private RosSystemGrammarAccess grammarAccess;

    	public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystem.g:53:1: entryRuleRosSystem : ruleRosSystem EOF ;
    public final void entryRuleRosSystem() throws RecognitionException {
        try {
            // InternalRosSystem.g:54:1: ( ruleRosSystem EOF )
            // InternalRosSystem.g:55:1: ruleRosSystem EOF
            {
             before(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSystem();

            state._fsp--;

             after(grammarAccess.getRosSystemRule()); 
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
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystem.g:62:1: ruleRosSystem : ( ( rule__RosSystem__Group__0 ) ) ;
    public final void ruleRosSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:66:2: ( ( ( rule__RosSystem__Group__0 ) ) )
            // InternalRosSystem.g:67:2: ( ( rule__RosSystem__Group__0 ) )
            {
            // InternalRosSystem.g:67:2: ( ( rule__RosSystem__Group__0 ) )
            // InternalRosSystem.g:68:3: ( rule__RosSystem__Group__0 )
            {
             before(grammarAccess.getRosSystemAccess().getGroup()); 
            // InternalRosSystem.g:69:3: ( rule__RosSystem__Group__0 )
            // InternalRosSystem.g:69:4: rule__RosSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystem.g:78:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalRosSystem.g:79:1: ( ruleNamespace EOF )
            // InternalRosSystem.g:80:1: ruleNamespace EOF
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
    // InternalRosSystem.g:87:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:91:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalRosSystem.g:92:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalRosSystem.g:92:2: ( ( rule__Namespace__Alternatives ) )
            // InternalRosSystem.g:93:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalRosSystem.g:94:3: ( rule__Namespace__Alternatives )
            // InternalRosSystem.g:94:4: rule__Namespace__Alternatives
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


    // $ANTLR start "entryRuleTopicConnection"
    // InternalRosSystem.g:103:1: entryRuleTopicConnection : ruleTopicConnection EOF ;
    public final void entryRuleTopicConnection() throws RecognitionException {
        try {
            // InternalRosSystem.g:104:1: ( ruleTopicConnection EOF )
            // InternalRosSystem.g:105:1: ruleTopicConnection EOF
            {
             before(grammarAccess.getTopicConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getTopicConnectionRule()); 
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
    // $ANTLR end "entryRuleTopicConnection"


    // $ANTLR start "ruleTopicConnection"
    // InternalRosSystem.g:112:1: ruleTopicConnection : ( ( rule__TopicConnection__Group__0 ) ) ;
    public final void ruleTopicConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:116:2: ( ( ( rule__TopicConnection__Group__0 ) ) )
            // InternalRosSystem.g:117:2: ( ( rule__TopicConnection__Group__0 ) )
            {
            // InternalRosSystem.g:117:2: ( ( rule__TopicConnection__Group__0 ) )
            // InternalRosSystem.g:118:3: ( rule__TopicConnection__Group__0 )
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup()); 
            // InternalRosSystem.g:119:3: ( rule__TopicConnection__Group__0 )
            // InternalRosSystem.g:119:4: rule__TopicConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getGroup()); 

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
    // $ANTLR end "ruleTopicConnection"


    // $ANTLR start "entryRuleServiceConnection"
    // InternalRosSystem.g:128:1: entryRuleServiceConnection : ruleServiceConnection EOF ;
    public final void entryRuleServiceConnection() throws RecognitionException {
        try {
            // InternalRosSystem.g:129:1: ( ruleServiceConnection EOF )
            // InternalRosSystem.g:130:1: ruleServiceConnection EOF
            {
             before(grammarAccess.getServiceConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getServiceConnectionRule()); 
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
    // $ANTLR end "entryRuleServiceConnection"


    // $ANTLR start "ruleServiceConnection"
    // InternalRosSystem.g:137:1: ruleServiceConnection : ( ( rule__ServiceConnection__Group__0 ) ) ;
    public final void ruleServiceConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:141:2: ( ( ( rule__ServiceConnection__Group__0 ) ) )
            // InternalRosSystem.g:142:2: ( ( rule__ServiceConnection__Group__0 ) )
            {
            // InternalRosSystem.g:142:2: ( ( rule__ServiceConnection__Group__0 ) )
            // InternalRosSystem.g:143:3: ( rule__ServiceConnection__Group__0 )
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup()); 
            // InternalRosSystem.g:144:3: ( rule__ServiceConnection__Group__0 )
            // InternalRosSystem.g:144:4: rule__ServiceConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceConnection"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystem.g:154:1: ( ruleEString EOF )
            // InternalRosSystem.g:155:1: ruleEString EOF
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
    // InternalRosSystem.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystem.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystem.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystem.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRosSystem.g:169:3: ( rule__EString__Alternatives )
            // InternalRosSystem.g:169:4: rule__EString__Alternatives
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
    // InternalRosSystem.g:178:1: entryRulePublisher : rulePublisher EOF ;
    public final void entryRulePublisher() throws RecognitionException {
        try {
            // InternalRosSystem.g:179:1: ( rulePublisher EOF )
            // InternalRosSystem.g:180:1: rulePublisher EOF
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
    // InternalRosSystem.g:187:1: rulePublisher : ( ( rule__Publisher__Group__0 ) ) ;
    public final void rulePublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:191:2: ( ( ( rule__Publisher__Group__0 ) ) )
            // InternalRosSystem.g:192:2: ( ( rule__Publisher__Group__0 ) )
            {
            // InternalRosSystem.g:192:2: ( ( rule__Publisher__Group__0 ) )
            // InternalRosSystem.g:193:3: ( rule__Publisher__Group__0 )
            {
             before(grammarAccess.getPublisherAccess().getGroup()); 
            // InternalRosSystem.g:194:3: ( rule__Publisher__Group__0 )
            // InternalRosSystem.g:194:4: rule__Publisher__Group__0
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
    // InternalRosSystem.g:203:1: entryRuleSubscriber : ruleSubscriber EOF ;
    public final void entryRuleSubscriber() throws RecognitionException {
        try {
            // InternalRosSystem.g:204:1: ( ruleSubscriber EOF )
            // InternalRosSystem.g:205:1: ruleSubscriber EOF
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
    // InternalRosSystem.g:212:1: ruleSubscriber : ( ( rule__Subscriber__Group__0 ) ) ;
    public final void ruleSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:216:2: ( ( ( rule__Subscriber__Group__0 ) ) )
            // InternalRosSystem.g:217:2: ( ( rule__Subscriber__Group__0 ) )
            {
            // InternalRosSystem.g:217:2: ( ( rule__Subscriber__Group__0 ) )
            // InternalRosSystem.g:218:3: ( rule__Subscriber__Group__0 )
            {
             before(grammarAccess.getSubscriberAccess().getGroup()); 
            // InternalRosSystem.g:219:3: ( rule__Subscriber__Group__0 )
            // InternalRosSystem.g:219:4: rule__Subscriber__Group__0
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


    // $ANTLR start "entryRuleGraphName"
    // InternalRosSystem.g:228:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalRosSystem.g:229:1: ( ruleGraphName EOF )
            // InternalRosSystem.g:230:1: ruleGraphName EOF
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
    // InternalRosSystem.g:237:1: ruleGraphName : ( 'GraphName' ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:241:2: ( ( 'GraphName' ) )
            // InternalRosSystem.g:242:2: ( 'GraphName' )
            {
            // InternalRosSystem.g:242:2: ( 'GraphName' )
            // InternalRosSystem.g:243:3: 'GraphName'
            {
             before(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 

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


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalRosSystem.g:253:1: entryRuleMessageDefinition : ruleMessageDefinition EOF ;
    public final void entryRuleMessageDefinition() throws RecognitionException {
        try {
            // InternalRosSystem.g:254:1: ( ruleMessageDefinition EOF )
            // InternalRosSystem.g:255:1: ruleMessageDefinition EOF
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
    // InternalRosSystem.g:262:1: ruleMessageDefinition : ( ( rule__MessageDefinition__Group__0 ) ) ;
    public final void ruleMessageDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:266:2: ( ( ( rule__MessageDefinition__Group__0 ) ) )
            // InternalRosSystem.g:267:2: ( ( rule__MessageDefinition__Group__0 ) )
            {
            // InternalRosSystem.g:267:2: ( ( rule__MessageDefinition__Group__0 ) )
            // InternalRosSystem.g:268:3: ( rule__MessageDefinition__Group__0 )
            {
             before(grammarAccess.getMessageDefinitionAccess().getGroup()); 
            // InternalRosSystem.g:269:3: ( rule__MessageDefinition__Group__0 )
            // InternalRosSystem.g:269:4: rule__MessageDefinition__Group__0
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


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRosSystem.g:278:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalRosSystem.g:279:1: ( ruleGlobalNamespace EOF )
            // InternalRosSystem.g:280:1: ruleGlobalNamespace EOF
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
    // InternalRosSystem.g:287:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:291:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalRosSystem.g:292:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalRosSystem.g:292:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalRosSystem.g:293:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalRosSystem.g:294:3: ( rule__GlobalNamespace__Group__0 )
            // InternalRosSystem.g:294:4: rule__GlobalNamespace__Group__0
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
    // InternalRosSystem.g:303:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalRosSystem.g:304:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalRosSystem.g:305:1: ruleRelativeNamespace_Impl EOF
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
    // InternalRosSystem.g:312:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:316:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalRosSystem.g:317:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalRosSystem.g:317:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalRosSystem.g:318:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalRosSystem.g:319:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalRosSystem.g:319:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalRosSystem.g:328:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalRosSystem.g:329:1: ( rulePrivateNamespace EOF )
            // InternalRosSystem.g:330:1: rulePrivateNamespace EOF
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
    // InternalRosSystem.g:337:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:341:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalRosSystem.g:342:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalRosSystem.g:342:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalRosSystem.g:343:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalRosSystem.g:344:3: ( rule__PrivateNamespace__Group__0 )
            // InternalRosSystem.g:344:4: rule__PrivateNamespace__Group__0
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


    // $ANTLR start "entryRuleServiceServer"
    // InternalRosSystem.g:353:1: entryRuleServiceServer : ruleServiceServer EOF ;
    public final void entryRuleServiceServer() throws RecognitionException {
        try {
            // InternalRosSystem.g:354:1: ( ruleServiceServer EOF )
            // InternalRosSystem.g:355:1: ruleServiceServer EOF
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
    // InternalRosSystem.g:362:1: ruleServiceServer : ( ( rule__ServiceServer__Group__0 ) ) ;
    public final void ruleServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:366:2: ( ( ( rule__ServiceServer__Group__0 ) ) )
            // InternalRosSystem.g:367:2: ( ( rule__ServiceServer__Group__0 ) )
            {
            // InternalRosSystem.g:367:2: ( ( rule__ServiceServer__Group__0 ) )
            // InternalRosSystem.g:368:3: ( rule__ServiceServer__Group__0 )
            {
             before(grammarAccess.getServiceServerAccess().getGroup()); 
            // InternalRosSystem.g:369:3: ( rule__ServiceServer__Group__0 )
            // InternalRosSystem.g:369:4: rule__ServiceServer__Group__0
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
    // InternalRosSystem.g:378:1: entryRuleServiceClient : ruleServiceClient EOF ;
    public final void entryRuleServiceClient() throws RecognitionException {
        try {
            // InternalRosSystem.g:379:1: ( ruleServiceClient EOF )
            // InternalRosSystem.g:380:1: ruleServiceClient EOF
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
    // InternalRosSystem.g:387:1: ruleServiceClient : ( ( rule__ServiceClient__Group__0 ) ) ;
    public final void ruleServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:391:2: ( ( ( rule__ServiceClient__Group__0 ) ) )
            // InternalRosSystem.g:392:2: ( ( rule__ServiceClient__Group__0 ) )
            {
            // InternalRosSystem.g:392:2: ( ( rule__ServiceClient__Group__0 ) )
            // InternalRosSystem.g:393:3: ( rule__ServiceClient__Group__0 )
            {
             before(grammarAccess.getServiceClientAccess().getGroup()); 
            // InternalRosSystem.g:394:3: ( rule__ServiceClient__Group__0 )
            // InternalRosSystem.g:394:4: rule__ServiceClient__Group__0
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
    // InternalRosSystem.g:402:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:406:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 33:
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
                    // InternalRosSystem.g:407:2: ( ruleGlobalNamespace )
                    {
                    // InternalRosSystem.g:407:2: ( ruleGlobalNamespace )
                    // InternalRosSystem.g:408:3: ruleGlobalNamespace
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
                    // InternalRosSystem.g:413:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalRosSystem.g:413:2: ( ruleRelativeNamespace_Impl )
                    // InternalRosSystem.g:414:3: ruleRelativeNamespace_Impl
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
                    // InternalRosSystem.g:419:2: ( rulePrivateNamespace )
                    {
                    // InternalRosSystem.g:419:2: ( rulePrivateNamespace )
                    // InternalRosSystem.g:420:3: rulePrivateNamespace
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosSystem.g:429:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:433:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosSystem.g:434:2: ( RULE_STRING )
                    {
                    // InternalRosSystem.g:434:2: ( RULE_STRING )
                    // InternalRosSystem.g:435:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:440:2: ( RULE_ID )
                    {
                    // InternalRosSystem.g:440:2: ( RULE_ID )
                    // InternalRosSystem.g:441:3: RULE_ID
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


    // $ANTLR start "rule__RosSystem__Group__0"
    // InternalRosSystem.g:450:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:454:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystem.g:455:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__1();

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
    // $ANTLR end "rule__RosSystem__Group__0"


    // $ANTLR start "rule__RosSystem__Group__0__Impl"
    // InternalRosSystem.g:462:1: rule__RosSystem__Group__0__Impl : ( () ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:466:1: ( ( () ) )
            // InternalRosSystem.g:467:1: ( () )
            {
            // InternalRosSystem.g:467:1: ( () )
            // InternalRosSystem.g:468:2: ()
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 
            // InternalRosSystem.g:469:2: ()
            // InternalRosSystem.g:469:3: 
            {
            }

             after(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__0__Impl"


    // $ANTLR start "rule__RosSystem__Group__1"
    // InternalRosSystem.g:477:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:481:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystem.g:482:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__2();

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
    // $ANTLR end "rule__RosSystem__Group__1"


    // $ANTLR start "rule__RosSystem__Group__1__Impl"
    // InternalRosSystem.g:489:1: rule__RosSystem__Group__1__Impl : ( 'RosSystem' ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:493:1: ( ( 'RosSystem' ) )
            // InternalRosSystem.g:494:1: ( 'RosSystem' )
            {
            // InternalRosSystem.g:494:1: ( 'RosSystem' )
            // InternalRosSystem.g:495:2: 'RosSystem'
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); 

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
    // $ANTLR end "rule__RosSystem__Group__1__Impl"


    // $ANTLR start "rule__RosSystem__Group__2"
    // InternalRosSystem.g:504:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:508:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystem.g:509:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__3();

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
    // $ANTLR end "rule__RosSystem__Group__2"


    // $ANTLR start "rule__RosSystem__Group__2__Impl"
    // InternalRosSystem.g:516:1: rule__RosSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:520:1: ( ( '{' ) )
            // InternalRosSystem.g:521:1: ( '{' )
            {
            // InternalRosSystem.g:521:1: ( '{' )
            // InternalRosSystem.g:522:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RosSystem__Group__2__Impl"


    // $ANTLR start "rule__RosSystem__Group__3"
    // InternalRosSystem.g:531:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:535:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystem.g:536:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__4();

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
    // $ANTLR end "rule__RosSystem__Group__3"


    // $ANTLR start "rule__RosSystem__Group__3__Impl"
    // InternalRosSystem.g:543:1: rule__RosSystem__Group__3__Impl : ( ( rule__RosSystem__Group_3__0 )? ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:547:1: ( ( ( rule__RosSystem__Group_3__0 )? ) )
            // InternalRosSystem.g:548:1: ( ( rule__RosSystem__Group_3__0 )? )
            {
            // InternalRosSystem.g:548:1: ( ( rule__RosSystem__Group_3__0 )? )
            // InternalRosSystem.g:549:2: ( rule__RosSystem__Group_3__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_3()); 
            // InternalRosSystem.g:550:2: ( rule__RosSystem__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:550:3: rule__RosSystem__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RosSystem__Group__3__Impl"


    // $ANTLR start "rule__RosSystem__Group__4"
    // InternalRosSystem.g:558:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:562:1: ( rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 )
            // InternalRosSystem.g:563:2: rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__5();

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
    // $ANTLR end "rule__RosSystem__Group__4"


    // $ANTLR start "rule__RosSystem__Group__4__Impl"
    // InternalRosSystem.g:570:1: rule__RosSystem__Group__4__Impl : ( ( rule__RosSystem__Group_4__0 )? ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:574:1: ( ( ( rule__RosSystem__Group_4__0 )? ) )
            // InternalRosSystem.g:575:1: ( ( rule__RosSystem__Group_4__0 )? )
            {
            // InternalRosSystem.g:575:1: ( ( rule__RosSystem__Group_4__0 )? )
            // InternalRosSystem.g:576:2: ( rule__RosSystem__Group_4__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_4()); 
            // InternalRosSystem.g:577:2: ( rule__RosSystem__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystem.g:577:3: rule__RosSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__RosSystem__Group__4__Impl"


    // $ANTLR start "rule__RosSystem__Group__5"
    // InternalRosSystem.g:585:1: rule__RosSystem__Group__5 : rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 ;
    public final void rule__RosSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:589:1: ( rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 )
            // InternalRosSystem.g:590:2: rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__6();

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
    // $ANTLR end "rule__RosSystem__Group__5"


    // $ANTLR start "rule__RosSystem__Group__5__Impl"
    // InternalRosSystem.g:597:1: rule__RosSystem__Group__5__Impl : ( ( rule__RosSystem__Group_5__0 )? ) ;
    public final void rule__RosSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:601:1: ( ( ( rule__RosSystem__Group_5__0 )? ) )
            // InternalRosSystem.g:602:1: ( ( rule__RosSystem__Group_5__0 )? )
            {
            // InternalRosSystem.g:602:1: ( ( rule__RosSystem__Group_5__0 )? )
            // InternalRosSystem.g:603:2: ( rule__RosSystem__Group_5__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5()); 
            // InternalRosSystem.g:604:2: ( rule__RosSystem__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosSystem.g:604:3: rule__RosSystem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RosSystem__Group__5__Impl"


    // $ANTLR start "rule__RosSystem__Group__6"
    // InternalRosSystem.g:612:1: rule__RosSystem__Group__6 : rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 ;
    public final void rule__RosSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:616:1: ( rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 )
            // InternalRosSystem.g:617:2: rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__7();

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
    // $ANTLR end "rule__RosSystem__Group__6"


    // $ANTLR start "rule__RosSystem__Group__6__Impl"
    // InternalRosSystem.g:624:1: rule__RosSystem__Group__6__Impl : ( ( rule__RosSystem__Group_6__0 )? ) ;
    public final void rule__RosSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:628:1: ( ( ( rule__RosSystem__Group_6__0 )? ) )
            // InternalRosSystem.g:629:1: ( ( rule__RosSystem__Group_6__0 )? )
            {
            // InternalRosSystem.g:629:1: ( ( rule__RosSystem__Group_6__0 )? )
            // InternalRosSystem.g:630:2: ( rule__RosSystem__Group_6__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6()); 
            // InternalRosSystem.g:631:2: ( rule__RosSystem__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRosSystem.g:631:3: rule__RosSystem__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_6()); 

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
    // $ANTLR end "rule__RosSystem__Group__6__Impl"


    // $ANTLR start "rule__RosSystem__Group__7"
    // InternalRosSystem.g:639:1: rule__RosSystem__Group__7 : rule__RosSystem__Group__7__Impl ;
    public final void rule__RosSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:643:1: ( rule__RosSystem__Group__7__Impl )
            // InternalRosSystem.g:644:2: rule__RosSystem__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__7__Impl();

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
    // $ANTLR end "rule__RosSystem__Group__7"


    // $ANTLR start "rule__RosSystem__Group__7__Impl"
    // InternalRosSystem.g:650:1: rule__RosSystem__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:654:1: ( ( '}' ) )
            // InternalRosSystem.g:655:1: ( '}' )
            {
            // InternalRosSystem.g:655:1: ( '}' )
            // InternalRosSystem.g:656:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__RosSystem__Group__7__Impl"


    // $ANTLR start "rule__RosSystem__Group_3__0"
    // InternalRosSystem.g:666:1: rule__RosSystem__Group_3__0 : rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 ;
    public final void rule__RosSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:670:1: ( rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 )
            // InternalRosSystem.g:671:2: rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__RosSystem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3__1();

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
    // $ANTLR end "rule__RosSystem__Group_3__0"


    // $ANTLR start "rule__RosSystem__Group_3__0__Impl"
    // InternalRosSystem.g:678:1: rule__RosSystem__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__RosSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:682:1: ( ( 'Name' ) )
            // InternalRosSystem.g:683:1: ( 'Name' )
            {
            // InternalRosSystem.g:683:1: ( 'Name' )
            // InternalRosSystem.g:684:2: 'Name'
            {
             before(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__RosSystem__Group_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3__1"
    // InternalRosSystem.g:693:1: rule__RosSystem__Group_3__1 : rule__RosSystem__Group_3__1__Impl ;
    public final void rule__RosSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:697:1: ( rule__RosSystem__Group_3__1__Impl )
            // InternalRosSystem.g:698:2: rule__RosSystem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_3__1"


    // $ANTLR start "rule__RosSystem__Group_3__1__Impl"
    // InternalRosSystem.g:704:1: rule__RosSystem__Group_3__1__Impl : ( ( rule__RosSystem__NameAssignment_3_1 ) ) ;
    public final void rule__RosSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:708:1: ( ( ( rule__RosSystem__NameAssignment_3_1 ) ) )
            // InternalRosSystem.g:709:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:709:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            // InternalRosSystem.g:710:2: ( rule__RosSystem__NameAssignment_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); 
            // InternalRosSystem.g:711:2: ( rule__RosSystem__NameAssignment_3_1 )
            // InternalRosSystem.g:711:3: rule__RosSystem__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__RosSystem__Group_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__0"
    // InternalRosSystem.g:720:1: rule__RosSystem__Group_4__0 : rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 ;
    public final void rule__RosSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:724:1: ( rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 )
            // InternalRosSystem.g:725:2: rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__RosSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__1();

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
    // $ANTLR end "rule__RosSystem__Group_4__0"


    // $ANTLR start "rule__RosSystem__Group_4__0__Impl"
    // InternalRosSystem.g:732:1: rule__RosSystem__Group_4__0__Impl : ( 'RosComponent' ) ;
    public final void rule__RosSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:736:1: ( ( 'RosComponent' ) )
            // InternalRosSystem.g:737:1: ( 'RosComponent' )
            {
            // InternalRosSystem.g:737:1: ( 'RosComponent' )
            // InternalRosSystem.g:738:2: 'RosComponent'
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0()); 

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
    // $ANTLR end "rule__RosSystem__Group_4__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__1"
    // InternalRosSystem.g:747:1: rule__RosSystem__Group_4__1 : rule__RosSystem__Group_4__1__Impl ;
    public final void rule__RosSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:751:1: ( rule__RosSystem__Group_4__1__Impl )
            // InternalRosSystem.g:752:2: rule__RosSystem__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_4__1"


    // $ANTLR start "rule__RosSystem__Group_4__1__Impl"
    // InternalRosSystem.g:758:1: rule__RosSystem__Group_4__1__Impl : ( ( rule__RosSystem__RosComponentAssignment_4_1 ) ) ;
    public final void rule__RosSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:762:1: ( ( ( rule__RosSystem__RosComponentAssignment_4_1 ) ) )
            // InternalRosSystem.g:763:1: ( ( rule__RosSystem__RosComponentAssignment_4_1 ) )
            {
            // InternalRosSystem.g:763:1: ( ( rule__RosSystem__RosComponentAssignment_4_1 ) )
            // InternalRosSystem.g:764:2: ( rule__RosSystem__RosComponentAssignment_4_1 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_1()); 
            // InternalRosSystem.g:765:2: ( rule__RosSystem__RosComponentAssignment_4_1 )
            // InternalRosSystem.g:765:3: rule__RosSystem__RosComponentAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosComponentAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosComponentAssignment_4_1()); 

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
    // $ANTLR end "rule__RosSystem__Group_4__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__0"
    // InternalRosSystem.g:774:1: rule__RosSystem__Group_5__0 : rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 ;
    public final void rule__RosSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:778:1: ( rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 )
            // InternalRosSystem.g:779:2: rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__1();

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
    // $ANTLR end "rule__RosSystem__Group_5__0"


    // $ANTLR start "rule__RosSystem__Group_5__0__Impl"
    // InternalRosSystem.g:786:1: rule__RosSystem__Group_5__0__Impl : ( 'TopicConnections' ) ;
    public final void rule__RosSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:790:1: ( ( 'TopicConnections' ) )
            // InternalRosSystem.g:791:1: ( 'TopicConnections' )
            {
            // InternalRosSystem.g:791:1: ( 'TopicConnections' )
            // InternalRosSystem.g:792:2: 'TopicConnections'
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); 

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
    // $ANTLR end "rule__RosSystem__Group_5__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__1"
    // InternalRosSystem.g:801:1: rule__RosSystem__Group_5__1 : rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 ;
    public final void rule__RosSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:805:1: ( rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 )
            // InternalRosSystem.g:806:2: rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__2();

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
    // $ANTLR end "rule__RosSystem__Group_5__1"


    // $ANTLR start "rule__RosSystem__Group_5__1__Impl"
    // InternalRosSystem.g:813:1: rule__RosSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:817:1: ( ( '{' ) )
            // InternalRosSystem.g:818:1: ( '{' )
            {
            // InternalRosSystem.g:818:1: ( '{' )
            // InternalRosSystem.g:819:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__RosSystem__Group_5__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__2"
    // InternalRosSystem.g:828:1: rule__RosSystem__Group_5__2 : rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 ;
    public final void rule__RosSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:832:1: ( rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 )
            // InternalRosSystem.g:833:2: rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__3();

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
    // $ANTLR end "rule__RosSystem__Group_5__2"


    // $ANTLR start "rule__RosSystem__Group_5__2__Impl"
    // InternalRosSystem.g:840:1: rule__RosSystem__Group_5__2__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) ;
    public final void rule__RosSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:844:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) )
            // InternalRosSystem.g:845:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            {
            // InternalRosSystem.g:845:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            // InternalRosSystem.g:846:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); 
            // InternalRosSystem.g:847:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            // InternalRosSystem.g:847:3: rule__RosSystem__TopicConnectionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); 

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
    // $ANTLR end "rule__RosSystem__Group_5__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__3"
    // InternalRosSystem.g:855:1: rule__RosSystem__Group_5__3 : rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 ;
    public final void rule__RosSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:859:1: ( rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 )
            // InternalRosSystem.g:860:2: rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__4();

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
    // $ANTLR end "rule__RosSystem__Group_5__3"


    // $ANTLR start "rule__RosSystem__Group_5__3__Impl"
    // InternalRosSystem.g:867:1: rule__RosSystem__Group_5__3__Impl : ( ( rule__RosSystem__Group_5_3__0 )* ) ;
    public final void rule__RosSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:871:1: ( ( ( rule__RosSystem__Group_5_3__0 )* ) )
            // InternalRosSystem.g:872:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            {
            // InternalRosSystem.g:872:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            // InternalRosSystem.g:873:2: ( rule__RosSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_3()); 
            // InternalRosSystem.g:874:2: ( rule__RosSystem__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRosSystem.g:874:3: rule__RosSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__RosSystem__Group_5__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__4"
    // InternalRosSystem.g:882:1: rule__RosSystem__Group_5__4 : rule__RosSystem__Group_5__4__Impl ;
    public final void rule__RosSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:886:1: ( rule__RosSystem__Group_5__4__Impl )
            // InternalRosSystem.g:887:2: rule__RosSystem__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__4__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_5__4"


    // $ANTLR start "rule__RosSystem__Group_5__4__Impl"
    // InternalRosSystem.g:893:1: rule__RosSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:897:1: ( ( '}' ) )
            // InternalRosSystem.g:898:1: ( '}' )
            {
            // InternalRosSystem.g:898:1: ( '}' )
            // InternalRosSystem.g:899:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__RosSystem__Group_5__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_3__0"
    // InternalRosSystem.g:909:1: rule__RosSystem__Group_5_3__0 : rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 ;
    public final void rule__RosSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:913:1: ( rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 )
            // InternalRosSystem.g:914:2: rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_3__1();

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
    // $ANTLR end "rule__RosSystem__Group_5_3__0"


    // $ANTLR start "rule__RosSystem__Group_5_3__0__Impl"
    // InternalRosSystem.g:921:1: rule__RosSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:925:1: ( ( ',' ) )
            // InternalRosSystem.g:926:1: ( ',' )
            {
            // InternalRosSystem.g:926:1: ( ',' )
            // InternalRosSystem.g:927:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__RosSystem__Group_5_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_3__1"
    // InternalRosSystem.g:936:1: rule__RosSystem__Group_5_3__1 : rule__RosSystem__Group_5_3__1__Impl ;
    public final void rule__RosSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:940:1: ( rule__RosSystem__Group_5_3__1__Impl )
            // InternalRosSystem.g:941:2: rule__RosSystem__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_5_3__1"


    // $ANTLR start "rule__RosSystem__Group_5_3__1__Impl"
    // InternalRosSystem.g:947:1: rule__RosSystem__Group_5_3__1__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) ;
    public final void rule__RosSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:951:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) )
            // InternalRosSystem.g:952:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            {
            // InternalRosSystem.g:952:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            // InternalRosSystem.g:953:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); 
            // InternalRosSystem.g:954:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            // InternalRosSystem.g:954:3: rule__RosSystem__TopicConnectionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__RosSystem__Group_5_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__0"
    // InternalRosSystem.g:963:1: rule__RosSystem__Group_6__0 : rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 ;
    public final void rule__RosSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:967:1: ( rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 )
            // InternalRosSystem.g:968:2: rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__1();

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
    // $ANTLR end "rule__RosSystem__Group_6__0"


    // $ANTLR start "rule__RosSystem__Group_6__0__Impl"
    // InternalRosSystem.g:975:1: rule__RosSystem__Group_6__0__Impl : ( 'ServiceConnections' ) ;
    public final void rule__RosSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:979:1: ( ( 'ServiceConnections' ) )
            // InternalRosSystem.g:980:1: ( 'ServiceConnections' )
            {
            // InternalRosSystem.g:980:1: ( 'ServiceConnections' )
            // InternalRosSystem.g:981:2: 'ServiceConnections'
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); 

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
    // $ANTLR end "rule__RosSystem__Group_6__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__1"
    // InternalRosSystem.g:990:1: rule__RosSystem__Group_6__1 : rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 ;
    public final void rule__RosSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:994:1: ( rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 )
            // InternalRosSystem.g:995:2: rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__2();

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
    // $ANTLR end "rule__RosSystem__Group_6__1"


    // $ANTLR start "rule__RosSystem__Group_6__1__Impl"
    // InternalRosSystem.g:1002:1: rule__RosSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1006:1: ( ( '{' ) )
            // InternalRosSystem.g:1007:1: ( '{' )
            {
            // InternalRosSystem.g:1007:1: ( '{' )
            // InternalRosSystem.g:1008:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__RosSystem__Group_6__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__2"
    // InternalRosSystem.g:1017:1: rule__RosSystem__Group_6__2 : rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 ;
    public final void rule__RosSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1021:1: ( rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 )
            // InternalRosSystem.g:1022:2: rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__3();

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
    // $ANTLR end "rule__RosSystem__Group_6__2"


    // $ANTLR start "rule__RosSystem__Group_6__2__Impl"
    // InternalRosSystem.g:1029:1: rule__RosSystem__Group_6__2__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) ;
    public final void rule__RosSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1033:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) )
            // InternalRosSystem.g:1034:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            {
            // InternalRosSystem.g:1034:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            // InternalRosSystem.g:1035:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); 
            // InternalRosSystem.g:1036:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            // InternalRosSystem.g:1036:3: rule__RosSystem__ServiceConnectionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); 

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
    // $ANTLR end "rule__RosSystem__Group_6__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__3"
    // InternalRosSystem.g:1044:1: rule__RosSystem__Group_6__3 : rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 ;
    public final void rule__RosSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1048:1: ( rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 )
            // InternalRosSystem.g:1049:2: rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__4();

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
    // $ANTLR end "rule__RosSystem__Group_6__3"


    // $ANTLR start "rule__RosSystem__Group_6__3__Impl"
    // InternalRosSystem.g:1056:1: rule__RosSystem__Group_6__3__Impl : ( ( rule__RosSystem__Group_6_3__0 )* ) ;
    public final void rule__RosSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1060:1: ( ( ( rule__RosSystem__Group_6_3__0 )* ) )
            // InternalRosSystem.g:1061:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            {
            // InternalRosSystem.g:1061:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            // InternalRosSystem.g:1062:2: ( rule__RosSystem__Group_6_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_3()); 
            // InternalRosSystem.g:1063:2: ( rule__RosSystem__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRosSystem.g:1063:3: rule__RosSystem__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosSystem__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__RosSystem__Group_6__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__4"
    // InternalRosSystem.g:1071:1: rule__RosSystem__Group_6__4 : rule__RosSystem__Group_6__4__Impl ;
    public final void rule__RosSystem__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1075:1: ( rule__RosSystem__Group_6__4__Impl )
            // InternalRosSystem.g:1076:2: rule__RosSystem__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__4__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_6__4"


    // $ANTLR start "rule__RosSystem__Group_6__4__Impl"
    // InternalRosSystem.g:1082:1: rule__RosSystem__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1086:1: ( ( '}' ) )
            // InternalRosSystem.g:1087:1: ( '}' )
            {
            // InternalRosSystem.g:1087:1: ( '}' )
            // InternalRosSystem.g:1088:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__RosSystem__Group_6__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_3__0"
    // InternalRosSystem.g:1098:1: rule__RosSystem__Group_6_3__0 : rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 ;
    public final void rule__RosSystem__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1102:1: ( rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 )
            // InternalRosSystem.g:1103:2: rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_3__1();

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
    // $ANTLR end "rule__RosSystem__Group_6_3__0"


    // $ANTLR start "rule__RosSystem__Group_6_3__0__Impl"
    // InternalRosSystem.g:1110:1: rule__RosSystem__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1114:1: ( ( ',' ) )
            // InternalRosSystem.g:1115:1: ( ',' )
            {
            // InternalRosSystem.g:1115:1: ( ',' )
            // InternalRosSystem.g:1116:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__RosSystem__Group_6_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_3__1"
    // InternalRosSystem.g:1125:1: rule__RosSystem__Group_6_3__1 : rule__RosSystem__Group_6_3__1__Impl ;
    public final void rule__RosSystem__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1129:1: ( rule__RosSystem__Group_6_3__1__Impl )
            // InternalRosSystem.g:1130:2: rule__RosSystem__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__RosSystem__Group_6_3__1"


    // $ANTLR start "rule__RosSystem__Group_6_3__1__Impl"
    // InternalRosSystem.g:1136:1: rule__RosSystem__Group_6_3__1__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) ;
    public final void rule__RosSystem__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1140:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) )
            // InternalRosSystem.g:1141:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            {
            // InternalRosSystem.g:1141:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            // InternalRosSystem.g:1142:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); 
            // InternalRosSystem.g:1143:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            // InternalRosSystem.g:1143:3: rule__RosSystem__ServiceConnectionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); 

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
    // $ANTLR end "rule__RosSystem__Group_6_3__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__0"
    // InternalRosSystem.g:1152:1: rule__TopicConnection__Group__0 : rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 ;
    public final void rule__TopicConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1156:1: ( rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 )
            // InternalRosSystem.g:1157:2: rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TopicConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__1();

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
    // $ANTLR end "rule__TopicConnection__Group__0"


    // $ANTLR start "rule__TopicConnection__Group__0__Impl"
    // InternalRosSystem.g:1164:1: rule__TopicConnection__Group__0__Impl : ( () ) ;
    public final void rule__TopicConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1168:1: ( ( () ) )
            // InternalRosSystem.g:1169:1: ( () )
            {
            // InternalRosSystem.g:1169:1: ( () )
            // InternalRosSystem.g:1170:2: ()
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicConnectionAction_0()); 
            // InternalRosSystem.g:1171:2: ()
            // InternalRosSystem.g:1171:3: 
            {
            }

             after(grammarAccess.getTopicConnectionAccess().getTopicConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group__1"
    // InternalRosSystem.g:1179:1: rule__TopicConnection__Group__1 : rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 ;
    public final void rule__TopicConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1183:1: ( rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 )
            // InternalRosSystem.g:1184:2: rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopicConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__2();

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
    // $ANTLR end "rule__TopicConnection__Group__1"


    // $ANTLR start "rule__TopicConnection__Group__1__Impl"
    // InternalRosSystem.g:1191:1: rule__TopicConnection__Group__1__Impl : ( 'TopicConnection' ) ;
    public final void rule__TopicConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1195:1: ( ( 'TopicConnection' ) )
            // InternalRosSystem.g:1196:1: ( 'TopicConnection' )
            {
            // InternalRosSystem.g:1196:1: ( 'TopicConnection' )
            // InternalRosSystem.g:1197:2: 'TopicConnection'
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_1()); 

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
    // $ANTLR end "rule__TopicConnection__Group__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__2"
    // InternalRosSystem.g:1206:1: rule__TopicConnection__Group__2 : rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 ;
    public final void rule__TopicConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1210:1: ( rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 )
            // InternalRosSystem.g:1211:2: rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TopicConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__3();

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
    // $ANTLR end "rule__TopicConnection__Group__2"


    // $ANTLR start "rule__TopicConnection__Group__2__Impl"
    // InternalRosSystem.g:1218:1: rule__TopicConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1222:1: ( ( '{' ) )
            // InternalRosSystem.g:1223:1: ( '{' )
            {
            // InternalRosSystem.g:1223:1: ( '{' )
            // InternalRosSystem.g:1224:2: '{'
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TopicConnection__Group__2__Impl"


    // $ANTLR start "rule__TopicConnection__Group__3"
    // InternalRosSystem.g:1233:1: rule__TopicConnection__Group__3 : rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 ;
    public final void rule__TopicConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1237:1: ( rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 )
            // InternalRosSystem.g:1238:2: rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__TopicConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__4();

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
    // $ANTLR end "rule__TopicConnection__Group__3"


    // $ANTLR start "rule__TopicConnection__Group__3__Impl"
    // InternalRosSystem.g:1245:1: rule__TopicConnection__Group__3__Impl : ( ( rule__TopicConnection__Group_3__0 )? ) ;
    public final void rule__TopicConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1249:1: ( ( ( rule__TopicConnection__Group_3__0 )? ) )
            // InternalRosSystem.g:1250:1: ( ( rule__TopicConnection__Group_3__0 )? )
            {
            // InternalRosSystem.g:1250:1: ( ( rule__TopicConnection__Group_3__0 )? )
            // InternalRosSystem.g:1251:2: ( rule__TopicConnection__Group_3__0 )?
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_3()); 
            // InternalRosSystem.g:1252:2: ( rule__TopicConnection__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:1252:3: rule__TopicConnection__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopicConnection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopicConnectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TopicConnection__Group__3__Impl"


    // $ANTLR start "rule__TopicConnection__Group__4"
    // InternalRosSystem.g:1260:1: rule__TopicConnection__Group__4 : rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 ;
    public final void rule__TopicConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1264:1: ( rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 )
            // InternalRosSystem.g:1265:2: rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__TopicConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__5();

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
    // $ANTLR end "rule__TopicConnection__Group__4"


    // $ANTLR start "rule__TopicConnection__Group__4__Impl"
    // InternalRosSystem.g:1272:1: rule__TopicConnection__Group__4__Impl : ( ( rule__TopicConnection__Group_4__0 )? ) ;
    public final void rule__TopicConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1276:1: ( ( ( rule__TopicConnection__Group_4__0 )? ) )
            // InternalRosSystem.g:1277:1: ( ( rule__TopicConnection__Group_4__0 )? )
            {
            // InternalRosSystem.g:1277:1: ( ( rule__TopicConnection__Group_4__0 )? )
            // InternalRosSystem.g:1278:2: ( rule__TopicConnection__Group_4__0 )?
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_4()); 
            // InternalRosSystem.g:1279:2: ( rule__TopicConnection__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosSystem.g:1279:3: rule__TopicConnection__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TopicConnection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopicConnectionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TopicConnection__Group__4__Impl"


    // $ANTLR start "rule__TopicConnection__Group__5"
    // InternalRosSystem.g:1287:1: rule__TopicConnection__Group__5 : rule__TopicConnection__Group__5__Impl ;
    public final void rule__TopicConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1291:1: ( rule__TopicConnection__Group__5__Impl )
            // InternalRosSystem.g:1292:2: rule__TopicConnection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__5__Impl();

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
    // $ANTLR end "rule__TopicConnection__Group__5"


    // $ANTLR start "rule__TopicConnection__Group__5__Impl"
    // InternalRosSystem.g:1298:1: rule__TopicConnection__Group__5__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1302:1: ( ( '}' ) )
            // InternalRosSystem.g:1303:1: ( '}' )
            {
            // InternalRosSystem.g:1303:1: ( '}' )
            // InternalRosSystem.g:1304:2: '}'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__TopicConnection__Group__5__Impl"


    // $ANTLR start "rule__TopicConnection__Group_3__0"
    // InternalRosSystem.g:1314:1: rule__TopicConnection__Group_3__0 : rule__TopicConnection__Group_3__0__Impl rule__TopicConnection__Group_3__1 ;
    public final void rule__TopicConnection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1318:1: ( rule__TopicConnection__Group_3__0__Impl rule__TopicConnection__Group_3__1 )
            // InternalRosSystem.g:1319:2: rule__TopicConnection__Group_3__0__Impl rule__TopicConnection__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_3__1();

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
    // $ANTLR end "rule__TopicConnection__Group_3__0"


    // $ANTLR start "rule__TopicConnection__Group_3__0__Impl"
    // InternalRosSystem.g:1326:1: rule__TopicConnection__Group_3__0__Impl : ( 'From' ) ;
    public final void rule__TopicConnection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1330:1: ( ( 'From' ) )
            // InternalRosSystem.g:1331:1: ( 'From' )
            {
            // InternalRosSystem.g:1331:1: ( 'From' )
            // InternalRosSystem.g:1332:2: 'From'
            {
             before(grammarAccess.getTopicConnectionAccess().getFromKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getFromKeyword_3_0()); 

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
    // $ANTLR end "rule__TopicConnection__Group_3__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group_3__1"
    // InternalRosSystem.g:1341:1: rule__TopicConnection__Group_3__1 : rule__TopicConnection__Group_3__1__Impl ;
    public final void rule__TopicConnection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1345:1: ( rule__TopicConnection__Group_3__1__Impl )
            // InternalRosSystem.g:1346:2: rule__TopicConnection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_3__1__Impl();

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
    // $ANTLR end "rule__TopicConnection__Group_3__1"


    // $ANTLR start "rule__TopicConnection__Group_3__1__Impl"
    // InternalRosSystem.g:1352:1: rule__TopicConnection__Group_3__1__Impl : ( ( rule__TopicConnection__FromAssignment_3_1 ) ) ;
    public final void rule__TopicConnection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1356:1: ( ( ( rule__TopicConnection__FromAssignment_3_1 ) ) )
            // InternalRosSystem.g:1357:1: ( ( rule__TopicConnection__FromAssignment_3_1 ) )
            {
            // InternalRosSystem.g:1357:1: ( ( rule__TopicConnection__FromAssignment_3_1 ) )
            // InternalRosSystem.g:1358:2: ( rule__TopicConnection__FromAssignment_3_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromAssignment_3_1()); 
            // InternalRosSystem.g:1359:2: ( rule__TopicConnection__FromAssignment_3_1 )
            // InternalRosSystem.g:1359:3: rule__TopicConnection__FromAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__FromAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getFromAssignment_3_1()); 

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
    // $ANTLR end "rule__TopicConnection__Group_3__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group_4__0"
    // InternalRosSystem.g:1368:1: rule__TopicConnection__Group_4__0 : rule__TopicConnection__Group_4__0__Impl rule__TopicConnection__Group_4__1 ;
    public final void rule__TopicConnection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1372:1: ( rule__TopicConnection__Group_4__0__Impl rule__TopicConnection__Group_4__1 )
            // InternalRosSystem.g:1373:2: rule__TopicConnection__Group_4__0__Impl rule__TopicConnection__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_4__1();

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
    // $ANTLR end "rule__TopicConnection__Group_4__0"


    // $ANTLR start "rule__TopicConnection__Group_4__0__Impl"
    // InternalRosSystem.g:1380:1: rule__TopicConnection__Group_4__0__Impl : ( 'To' ) ;
    public final void rule__TopicConnection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1384:1: ( ( 'To' ) )
            // InternalRosSystem.g:1385:1: ( 'To' )
            {
            // InternalRosSystem.g:1385:1: ( 'To' )
            // InternalRosSystem.g:1386:2: 'To'
            {
             before(grammarAccess.getTopicConnectionAccess().getToKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getToKeyword_4_0()); 

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
    // $ANTLR end "rule__TopicConnection__Group_4__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group_4__1"
    // InternalRosSystem.g:1395:1: rule__TopicConnection__Group_4__1 : rule__TopicConnection__Group_4__1__Impl ;
    public final void rule__TopicConnection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1399:1: ( rule__TopicConnection__Group_4__1__Impl )
            // InternalRosSystem.g:1400:2: rule__TopicConnection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_4__1__Impl();

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
    // $ANTLR end "rule__TopicConnection__Group_4__1"


    // $ANTLR start "rule__TopicConnection__Group_4__1__Impl"
    // InternalRosSystem.g:1406:1: rule__TopicConnection__Group_4__1__Impl : ( ( rule__TopicConnection__ToAssignment_4_1 ) ) ;
    public final void rule__TopicConnection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1410:1: ( ( ( rule__TopicConnection__ToAssignment_4_1 ) ) )
            // InternalRosSystem.g:1411:1: ( ( rule__TopicConnection__ToAssignment_4_1 ) )
            {
            // InternalRosSystem.g:1411:1: ( ( rule__TopicConnection__ToAssignment_4_1 ) )
            // InternalRosSystem.g:1412:2: ( rule__TopicConnection__ToAssignment_4_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToAssignment_4_1()); 
            // InternalRosSystem.g:1413:2: ( rule__TopicConnection__ToAssignment_4_1 )
            // InternalRosSystem.g:1413:3: rule__TopicConnection__ToAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__ToAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getToAssignment_4_1()); 

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
    // $ANTLR end "rule__TopicConnection__Group_4__1__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__0"
    // InternalRosSystem.g:1422:1: rule__ServiceConnection__Group__0 : rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 ;
    public final void rule__ServiceConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1426:1: ( rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 )
            // InternalRosSystem.g:1427:2: rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ServiceConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__1();

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
    // $ANTLR end "rule__ServiceConnection__Group__0"


    // $ANTLR start "rule__ServiceConnection__Group__0__Impl"
    // InternalRosSystem.g:1434:1: rule__ServiceConnection__Group__0__Impl : ( () ) ;
    public final void rule__ServiceConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1438:1: ( ( () ) )
            // InternalRosSystem.g:1439:1: ( () )
            {
            // InternalRosSystem.g:1439:1: ( () )
            // InternalRosSystem.g:1440:2: ()
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceConnectionAction_0()); 
            // InternalRosSystem.g:1441:2: ()
            // InternalRosSystem.g:1441:3: 
            {
            }

             after(grammarAccess.getServiceConnectionAccess().getServiceConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__0__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__1"
    // InternalRosSystem.g:1449:1: rule__ServiceConnection__Group__1 : rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 ;
    public final void rule__ServiceConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1453:1: ( rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 )
            // InternalRosSystem.g:1454:2: rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__2();

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
    // $ANTLR end "rule__ServiceConnection__Group__1"


    // $ANTLR start "rule__ServiceConnection__Group__1__Impl"
    // InternalRosSystem.g:1461:1: rule__ServiceConnection__Group__1__Impl : ( 'ServiceConnection' ) ;
    public final void rule__ServiceConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1465:1: ( ( 'ServiceConnection' ) )
            // InternalRosSystem.g:1466:1: ( 'ServiceConnection' )
            {
            // InternalRosSystem.g:1466:1: ( 'ServiceConnection' )
            // InternalRosSystem.g:1467:2: 'ServiceConnection'
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_1()); 

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
    // $ANTLR end "rule__ServiceConnection__Group__1__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__2"
    // InternalRosSystem.g:1476:1: rule__ServiceConnection__Group__2 : rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 ;
    public final void rule__ServiceConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1480:1: ( rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 )
            // InternalRosSystem.g:1481:2: rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ServiceConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__3();

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
    // $ANTLR end "rule__ServiceConnection__Group__2"


    // $ANTLR start "rule__ServiceConnection__Group__2__Impl"
    // InternalRosSystem.g:1488:1: rule__ServiceConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1492:1: ( ( '{' ) )
            // InternalRosSystem.g:1493:1: ( '{' )
            {
            // InternalRosSystem.g:1493:1: ( '{' )
            // InternalRosSystem.g:1494:2: '{'
            {
             before(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServiceConnection__Group__2__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__3"
    // InternalRosSystem.g:1503:1: rule__ServiceConnection__Group__3 : rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 ;
    public final void rule__ServiceConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1507:1: ( rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 )
            // InternalRosSystem.g:1508:2: rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ServiceConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__4();

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
    // $ANTLR end "rule__ServiceConnection__Group__3"


    // $ANTLR start "rule__ServiceConnection__Group__3__Impl"
    // InternalRosSystem.g:1515:1: rule__ServiceConnection__Group__3__Impl : ( ( rule__ServiceConnection__Group_3__0 )? ) ;
    public final void rule__ServiceConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1519:1: ( ( ( rule__ServiceConnection__Group_3__0 )? ) )
            // InternalRosSystem.g:1520:1: ( ( rule__ServiceConnection__Group_3__0 )? )
            {
            // InternalRosSystem.g:1520:1: ( ( rule__ServiceConnection__Group_3__0 )? )
            // InternalRosSystem.g:1521:2: ( rule__ServiceConnection__Group_3__0 )?
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup_3()); 
            // InternalRosSystem.g:1522:2: ( rule__ServiceConnection__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRosSystem.g:1522:3: rule__ServiceConnection__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConnection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConnectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ServiceConnection__Group__3__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__4"
    // InternalRosSystem.g:1530:1: rule__ServiceConnection__Group__4 : rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 ;
    public final void rule__ServiceConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1534:1: ( rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 )
            // InternalRosSystem.g:1535:2: rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ServiceConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__5();

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
    // $ANTLR end "rule__ServiceConnection__Group__4"


    // $ANTLR start "rule__ServiceConnection__Group__4__Impl"
    // InternalRosSystem.g:1542:1: rule__ServiceConnection__Group__4__Impl : ( ( rule__ServiceConnection__Group_4__0 )? ) ;
    public final void rule__ServiceConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1546:1: ( ( ( rule__ServiceConnection__Group_4__0 )? ) )
            // InternalRosSystem.g:1547:1: ( ( rule__ServiceConnection__Group_4__0 )? )
            {
            // InternalRosSystem.g:1547:1: ( ( rule__ServiceConnection__Group_4__0 )? )
            // InternalRosSystem.g:1548:2: ( rule__ServiceConnection__Group_4__0 )?
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup_4()); 
            // InternalRosSystem.g:1549:2: ( rule__ServiceConnection__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystem.g:1549:3: rule__ServiceConnection__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConnection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConnectionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ServiceConnection__Group__4__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__5"
    // InternalRosSystem.g:1557:1: rule__ServiceConnection__Group__5 : rule__ServiceConnection__Group__5__Impl ;
    public final void rule__ServiceConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1561:1: ( rule__ServiceConnection__Group__5__Impl )
            // InternalRosSystem.g:1562:2: rule__ServiceConnection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__5__Impl();

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
    // $ANTLR end "rule__ServiceConnection__Group__5"


    // $ANTLR start "rule__ServiceConnection__Group__5__Impl"
    // InternalRosSystem.g:1568:1: rule__ServiceConnection__Group__5__Impl : ( '}' ) ;
    public final void rule__ServiceConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1572:1: ( ( '}' ) )
            // InternalRosSystem.g:1573:1: ( '}' )
            {
            // InternalRosSystem.g:1573:1: ( '}' )
            // InternalRosSystem.g:1574:2: '}'
            {
             before(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ServiceConnection__Group__5__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_3__0"
    // InternalRosSystem.g:1584:1: rule__ServiceConnection__Group_3__0 : rule__ServiceConnection__Group_3__0__Impl rule__ServiceConnection__Group_3__1 ;
    public final void rule__ServiceConnection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1588:1: ( rule__ServiceConnection__Group_3__0__Impl rule__ServiceConnection__Group_3__1 )
            // InternalRosSystem.g:1589:2: rule__ServiceConnection__Group_3__0__Impl rule__ServiceConnection__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_3__1();

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
    // $ANTLR end "rule__ServiceConnection__Group_3__0"


    // $ANTLR start "rule__ServiceConnection__Group_3__0__Impl"
    // InternalRosSystem.g:1596:1: rule__ServiceConnection__Group_3__0__Impl : ( 'From' ) ;
    public final void rule__ServiceConnection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1600:1: ( ( 'From' ) )
            // InternalRosSystem.g:1601:1: ( 'From' )
            {
            // InternalRosSystem.g:1601:1: ( 'From' )
            // InternalRosSystem.g:1602:2: 'From'
            {
             before(grammarAccess.getServiceConnectionAccess().getFromKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getFromKeyword_3_0()); 

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
    // $ANTLR end "rule__ServiceConnection__Group_3__0__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_3__1"
    // InternalRosSystem.g:1611:1: rule__ServiceConnection__Group_3__1 : rule__ServiceConnection__Group_3__1__Impl ;
    public final void rule__ServiceConnection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1615:1: ( rule__ServiceConnection__Group_3__1__Impl )
            // InternalRosSystem.g:1616:2: rule__ServiceConnection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_3__1__Impl();

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
    // $ANTLR end "rule__ServiceConnection__Group_3__1"


    // $ANTLR start "rule__ServiceConnection__Group_3__1__Impl"
    // InternalRosSystem.g:1622:1: rule__ServiceConnection__Group_3__1__Impl : ( ( rule__ServiceConnection__FromAssignment_3_1 ) ) ;
    public final void rule__ServiceConnection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1626:1: ( ( ( rule__ServiceConnection__FromAssignment_3_1 ) ) )
            // InternalRosSystem.g:1627:1: ( ( rule__ServiceConnection__FromAssignment_3_1 ) )
            {
            // InternalRosSystem.g:1627:1: ( ( rule__ServiceConnection__FromAssignment_3_1 ) )
            // InternalRosSystem.g:1628:2: ( rule__ServiceConnection__FromAssignment_3_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromAssignment_3_1()); 
            // InternalRosSystem.g:1629:2: ( rule__ServiceConnection__FromAssignment_3_1 )
            // InternalRosSystem.g:1629:3: rule__ServiceConnection__FromAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__FromAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getFromAssignment_3_1()); 

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
    // $ANTLR end "rule__ServiceConnection__Group_3__1__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_4__0"
    // InternalRosSystem.g:1638:1: rule__ServiceConnection__Group_4__0 : rule__ServiceConnection__Group_4__0__Impl rule__ServiceConnection__Group_4__1 ;
    public final void rule__ServiceConnection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1642:1: ( rule__ServiceConnection__Group_4__0__Impl rule__ServiceConnection__Group_4__1 )
            // InternalRosSystem.g:1643:2: rule__ServiceConnection__Group_4__0__Impl rule__ServiceConnection__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_4__1();

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
    // $ANTLR end "rule__ServiceConnection__Group_4__0"


    // $ANTLR start "rule__ServiceConnection__Group_4__0__Impl"
    // InternalRosSystem.g:1650:1: rule__ServiceConnection__Group_4__0__Impl : ( 'To' ) ;
    public final void rule__ServiceConnection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1654:1: ( ( 'To' ) )
            // InternalRosSystem.g:1655:1: ( 'To' )
            {
            // InternalRosSystem.g:1655:1: ( 'To' )
            // InternalRosSystem.g:1656:2: 'To'
            {
             before(grammarAccess.getServiceConnectionAccess().getToKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getToKeyword_4_0()); 

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
    // $ANTLR end "rule__ServiceConnection__Group_4__0__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_4__1"
    // InternalRosSystem.g:1665:1: rule__ServiceConnection__Group_4__1 : rule__ServiceConnection__Group_4__1__Impl ;
    public final void rule__ServiceConnection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1669:1: ( rule__ServiceConnection__Group_4__1__Impl )
            // InternalRosSystem.g:1670:2: rule__ServiceConnection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_4__1__Impl();

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
    // $ANTLR end "rule__ServiceConnection__Group_4__1"


    // $ANTLR start "rule__ServiceConnection__Group_4__1__Impl"
    // InternalRosSystem.g:1676:1: rule__ServiceConnection__Group_4__1__Impl : ( ( rule__ServiceConnection__ToAssignment_4_1 ) ) ;
    public final void rule__ServiceConnection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1680:1: ( ( ( rule__ServiceConnection__ToAssignment_4_1 ) ) )
            // InternalRosSystem.g:1681:1: ( ( rule__ServiceConnection__ToAssignment_4_1 ) )
            {
            // InternalRosSystem.g:1681:1: ( ( rule__ServiceConnection__ToAssignment_4_1 ) )
            // InternalRosSystem.g:1682:2: ( rule__ServiceConnection__ToAssignment_4_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getToAssignment_4_1()); 
            // InternalRosSystem.g:1683:2: ( rule__ServiceConnection__ToAssignment_4_1 )
            // InternalRosSystem.g:1683:3: rule__ServiceConnection__ToAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__ToAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getToAssignment_4_1()); 

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
    // $ANTLR end "rule__ServiceConnection__Group_4__1__Impl"


    // $ANTLR start "rule__Publisher__Group__0"
    // InternalRosSystem.g:1692:1: rule__Publisher__Group__0 : rule__Publisher__Group__0__Impl rule__Publisher__Group__1 ;
    public final void rule__Publisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1696:1: ( rule__Publisher__Group__0__Impl rule__Publisher__Group__1 )
            // InternalRosSystem.g:1697:2: rule__Publisher__Group__0__Impl rule__Publisher__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalRosSystem.g:1704:1: rule__Publisher__Group__0__Impl : ( () ) ;
    public final void rule__Publisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1708:1: ( ( () ) )
            // InternalRosSystem.g:1709:1: ( () )
            {
            // InternalRosSystem.g:1709:1: ( () )
            // InternalRosSystem.g:1710:2: ()
            {
             before(grammarAccess.getPublisherAccess().getPublisherAction_0()); 
            // InternalRosSystem.g:1711:2: ()
            // InternalRosSystem.g:1711:3: 
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
    // InternalRosSystem.g:1719:1: rule__Publisher__Group__1 : rule__Publisher__Group__1__Impl rule__Publisher__Group__2 ;
    public final void rule__Publisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1723:1: ( rule__Publisher__Group__1__Impl rule__Publisher__Group__2 )
            // InternalRosSystem.g:1724:2: rule__Publisher__Group__1__Impl rule__Publisher__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:1731:1: rule__Publisher__Group__1__Impl : ( 'Publisher' ) ;
    public final void rule__Publisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1735:1: ( ( 'Publisher' ) )
            // InternalRosSystem.g:1736:1: ( 'Publisher' )
            {
            // InternalRosSystem.g:1736:1: ( 'Publisher' )
            // InternalRosSystem.g:1737:2: 'Publisher'
            {
             before(grammarAccess.getPublisherAccess().getPublisherKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRosSystem.g:1746:1: rule__Publisher__Group__2 : rule__Publisher__Group__2__Impl rule__Publisher__Group__3 ;
    public final void rule__Publisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1750:1: ( rule__Publisher__Group__2__Impl rule__Publisher__Group__3 )
            // InternalRosSystem.g:1751:2: rule__Publisher__Group__2__Impl rule__Publisher__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:1758:1: rule__Publisher__Group__2__Impl : ( '{' ) ;
    public final void rule__Publisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1762:1: ( ( '{' ) )
            // InternalRosSystem.g:1763:1: ( '{' )
            {
            // InternalRosSystem.g:1763:1: ( '{' )
            // InternalRosSystem.g:1764:2: '{'
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
    // InternalRosSystem.g:1773:1: rule__Publisher__Group__3 : rule__Publisher__Group__3__Impl rule__Publisher__Group__4 ;
    public final void rule__Publisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1777:1: ( rule__Publisher__Group__3__Impl rule__Publisher__Group__4 )
            // InternalRosSystem.g:1778:2: rule__Publisher__Group__3__Impl rule__Publisher__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:1785:1: rule__Publisher__Group__3__Impl : ( ( rule__Publisher__Group_3__0 )? ) ;
    public final void rule__Publisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1789:1: ( ( ( rule__Publisher__Group_3__0 )? ) )
            // InternalRosSystem.g:1790:1: ( ( rule__Publisher__Group_3__0 )? )
            {
            // InternalRosSystem.g:1790:1: ( ( rule__Publisher__Group_3__0 )? )
            // InternalRosSystem.g:1791:2: ( rule__Publisher__Group_3__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_3()); 
            // InternalRosSystem.g:1792:2: ( rule__Publisher__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosSystem.g:1792:3: rule__Publisher__Group_3__0
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
    // InternalRosSystem.g:1800:1: rule__Publisher__Group__4 : rule__Publisher__Group__4__Impl rule__Publisher__Group__5 ;
    public final void rule__Publisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1804:1: ( rule__Publisher__Group__4__Impl rule__Publisher__Group__5 )
            // InternalRosSystem.g:1805:2: rule__Publisher__Group__4__Impl rule__Publisher__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:1812:1: rule__Publisher__Group__4__Impl : ( ( rule__Publisher__Group_4__0 )? ) ;
    public final void rule__Publisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1816:1: ( ( ( rule__Publisher__Group_4__0 )? ) )
            // InternalRosSystem.g:1817:1: ( ( rule__Publisher__Group_4__0 )? )
            {
            // InternalRosSystem.g:1817:1: ( ( rule__Publisher__Group_4__0 )? )
            // InternalRosSystem.g:1818:2: ( rule__Publisher__Group_4__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_4()); 
            // InternalRosSystem.g:1819:2: ( rule__Publisher__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystem.g:1819:3: rule__Publisher__Group_4__0
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
    // InternalRosSystem.g:1827:1: rule__Publisher__Group__5 : rule__Publisher__Group__5__Impl rule__Publisher__Group__6 ;
    public final void rule__Publisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1831:1: ( rule__Publisher__Group__5__Impl rule__Publisher__Group__6 )
            // InternalRosSystem.g:1832:2: rule__Publisher__Group__5__Impl rule__Publisher__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:1839:1: rule__Publisher__Group__5__Impl : ( ( rule__Publisher__Group_5__0 )? ) ;
    public final void rule__Publisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1843:1: ( ( ( rule__Publisher__Group_5__0 )? ) )
            // InternalRosSystem.g:1844:1: ( ( rule__Publisher__Group_5__0 )? )
            {
            // InternalRosSystem.g:1844:1: ( ( rule__Publisher__Group_5__0 )? )
            // InternalRosSystem.g:1845:2: ( rule__Publisher__Group_5__0 )?
            {
             before(grammarAccess.getPublisherAccess().getGroup_5()); 
            // InternalRosSystem.g:1846:2: ( rule__Publisher__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:1846:3: rule__Publisher__Group_5__0
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
    // InternalRosSystem.g:1854:1: rule__Publisher__Group__6 : rule__Publisher__Group__6__Impl ;
    public final void rule__Publisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1858:1: ( rule__Publisher__Group__6__Impl )
            // InternalRosSystem.g:1859:2: rule__Publisher__Group__6__Impl
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
    // InternalRosSystem.g:1865:1: rule__Publisher__Group__6__Impl : ( '}' ) ;
    public final void rule__Publisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1869:1: ( ( '}' ) )
            // InternalRosSystem.g:1870:1: ( '}' )
            {
            // InternalRosSystem.g:1870:1: ( '}' )
            // InternalRosSystem.g:1871:2: '}'
            {
             before(grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:1881:1: rule__Publisher__Group_3__0 : rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1 ;
    public final void rule__Publisher__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1885:1: ( rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1 )
            // InternalRosSystem.g:1886:2: rule__Publisher__Group_3__0__Impl rule__Publisher__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:1893:1: rule__Publisher__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__Publisher__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1897:1: ( ( 'TopicName' ) )
            // InternalRosSystem.g:1898:1: ( 'TopicName' )
            {
            // InternalRosSystem.g:1898:1: ( 'TopicName' )
            // InternalRosSystem.g:1899:2: 'TopicName'
            {
             before(grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRosSystem.g:1908:1: rule__Publisher__Group_3__1 : rule__Publisher__Group_3__1__Impl ;
    public final void rule__Publisher__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1912:1: ( rule__Publisher__Group_3__1__Impl )
            // InternalRosSystem.g:1913:2: rule__Publisher__Group_3__1__Impl
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
    // InternalRosSystem.g:1919:1: rule__Publisher__Group_3__1__Impl : ( ( rule__Publisher__TopicNameAssignment_3_1 ) ) ;
    public final void rule__Publisher__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1923:1: ( ( ( rule__Publisher__TopicNameAssignment_3_1 ) ) )
            // InternalRosSystem.g:1924:1: ( ( rule__Publisher__TopicNameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:1924:1: ( ( rule__Publisher__TopicNameAssignment_3_1 ) )
            // InternalRosSystem.g:1925:2: ( rule__Publisher__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getPublisherAccess().getTopicNameAssignment_3_1()); 
            // InternalRosSystem.g:1926:2: ( rule__Publisher__TopicNameAssignment_3_1 )
            // InternalRosSystem.g:1926:3: rule__Publisher__TopicNameAssignment_3_1
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
    // InternalRosSystem.g:1935:1: rule__Publisher__Group_4__0 : rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1 ;
    public final void rule__Publisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1939:1: ( rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1 )
            // InternalRosSystem.g:1940:2: rule__Publisher__Group_4__0__Impl rule__Publisher__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:1947:1: rule__Publisher__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__Publisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1951:1: ( ( 'TopicRef' ) )
            // InternalRosSystem.g:1952:1: ( 'TopicRef' )
            {
            // InternalRosSystem.g:1952:1: ( 'TopicRef' )
            // InternalRosSystem.g:1953:2: 'TopicRef'
            {
             before(grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRosSystem.g:1962:1: rule__Publisher__Group_4__1 : rule__Publisher__Group_4__1__Impl ;
    public final void rule__Publisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1966:1: ( rule__Publisher__Group_4__1__Impl )
            // InternalRosSystem.g:1967:2: rule__Publisher__Group_4__1__Impl
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
    // InternalRosSystem.g:1973:1: rule__Publisher__Group_4__1__Impl : ( ( rule__Publisher__TopicRefAssignment_4_1 ) ) ;
    public final void rule__Publisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1977:1: ( ( ( rule__Publisher__TopicRefAssignment_4_1 ) ) )
            // InternalRosSystem.g:1978:1: ( ( rule__Publisher__TopicRefAssignment_4_1 ) )
            {
            // InternalRosSystem.g:1978:1: ( ( rule__Publisher__TopicRefAssignment_4_1 ) )
            // InternalRosSystem.g:1979:2: ( rule__Publisher__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getPublisherAccess().getTopicRefAssignment_4_1()); 
            // InternalRosSystem.g:1980:2: ( rule__Publisher__TopicRefAssignment_4_1 )
            // InternalRosSystem.g:1980:3: rule__Publisher__TopicRefAssignment_4_1
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
    // InternalRosSystem.g:1989:1: rule__Publisher__Group_5__0 : rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1 ;
    public final void rule__Publisher__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1993:1: ( rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1 )
            // InternalRosSystem.g:1994:2: rule__Publisher__Group_5__0__Impl rule__Publisher__Group_5__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2001:1: rule__Publisher__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__Publisher__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2005:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:2006:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:2006:1: ( 'NameSpace' )
            // InternalRosSystem.g:2007:2: 'NameSpace'
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRosSystem.g:2016:1: rule__Publisher__Group_5__1 : rule__Publisher__Group_5__1__Impl ;
    public final void rule__Publisher__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2020:1: ( rule__Publisher__Group_5__1__Impl )
            // InternalRosSystem.g:2021:2: rule__Publisher__Group_5__1__Impl
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
    // InternalRosSystem.g:2027:1: rule__Publisher__Group_5__1__Impl : ( ( rule__Publisher__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__Publisher__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2031:1: ( ( ( rule__Publisher__NameSpaceAssignment_5_1 ) ) )
            // InternalRosSystem.g:2032:1: ( ( rule__Publisher__NameSpaceAssignment_5_1 ) )
            {
            // InternalRosSystem.g:2032:1: ( ( rule__Publisher__NameSpaceAssignment_5_1 ) )
            // InternalRosSystem.g:2033:2: ( rule__Publisher__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceAssignment_5_1()); 
            // InternalRosSystem.g:2034:2: ( rule__Publisher__NameSpaceAssignment_5_1 )
            // InternalRosSystem.g:2034:3: rule__Publisher__NameSpaceAssignment_5_1
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
    // InternalRosSystem.g:2043:1: rule__Subscriber__Group__0 : rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 ;
    public final void rule__Subscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2047:1: ( rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 )
            // InternalRosSystem.g:2048:2: rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRosSystem.g:2055:1: rule__Subscriber__Group__0__Impl : ( () ) ;
    public final void rule__Subscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2059:1: ( ( () ) )
            // InternalRosSystem.g:2060:1: ( () )
            {
            // InternalRosSystem.g:2060:1: ( () )
            // InternalRosSystem.g:2061:2: ()
            {
             before(grammarAccess.getSubscriberAccess().getSubscriberAction_0()); 
            // InternalRosSystem.g:2062:2: ()
            // InternalRosSystem.g:2062:3: 
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
    // InternalRosSystem.g:2070:1: rule__Subscriber__Group__1 : rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 ;
    public final void rule__Subscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2074:1: ( rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 )
            // InternalRosSystem.g:2075:2: rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2082:1: rule__Subscriber__Group__1__Impl : ( 'Subscriber' ) ;
    public final void rule__Subscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2086:1: ( ( 'Subscriber' ) )
            // InternalRosSystem.g:2087:1: ( 'Subscriber' )
            {
            // InternalRosSystem.g:2087:1: ( 'Subscriber' )
            // InternalRosSystem.g:2088:2: 'Subscriber'
            {
             before(grammarAccess.getSubscriberAccess().getSubscriberKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRosSystem.g:2097:1: rule__Subscriber__Group__2 : rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 ;
    public final void rule__Subscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2101:1: ( rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 )
            // InternalRosSystem.g:2102:2: rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:2109:1: rule__Subscriber__Group__2__Impl : ( '{' ) ;
    public final void rule__Subscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2113:1: ( ( '{' ) )
            // InternalRosSystem.g:2114:1: ( '{' )
            {
            // InternalRosSystem.g:2114:1: ( '{' )
            // InternalRosSystem.g:2115:2: '{'
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
    // InternalRosSystem.g:2124:1: rule__Subscriber__Group__3 : rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 ;
    public final void rule__Subscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2128:1: ( rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 )
            // InternalRosSystem.g:2129:2: rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:2136:1: rule__Subscriber__Group__3__Impl : ( ( rule__Subscriber__Group_3__0 )? ) ;
    public final void rule__Subscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2140:1: ( ( ( rule__Subscriber__Group_3__0 )? ) )
            // InternalRosSystem.g:2141:1: ( ( rule__Subscriber__Group_3__0 )? )
            {
            // InternalRosSystem.g:2141:1: ( ( rule__Subscriber__Group_3__0 )? )
            // InternalRosSystem.g:2142:2: ( rule__Subscriber__Group_3__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_3()); 
            // InternalRosSystem.g:2143:2: ( rule__Subscriber__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystem.g:2143:3: rule__Subscriber__Group_3__0
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
    // InternalRosSystem.g:2151:1: rule__Subscriber__Group__4 : rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 ;
    public final void rule__Subscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2155:1: ( rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 )
            // InternalRosSystem.g:2156:2: rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:2163:1: rule__Subscriber__Group__4__Impl : ( ( rule__Subscriber__Group_4__0 )? ) ;
    public final void rule__Subscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2167:1: ( ( ( rule__Subscriber__Group_4__0 )? ) )
            // InternalRosSystem.g:2168:1: ( ( rule__Subscriber__Group_4__0 )? )
            {
            // InternalRosSystem.g:2168:1: ( ( rule__Subscriber__Group_4__0 )? )
            // InternalRosSystem.g:2169:2: ( rule__Subscriber__Group_4__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_4()); 
            // InternalRosSystem.g:2170:2: ( rule__Subscriber__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystem.g:2170:3: rule__Subscriber__Group_4__0
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
    // InternalRosSystem.g:2178:1: rule__Subscriber__Group__5 : rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 ;
    public final void rule__Subscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2182:1: ( rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 )
            // InternalRosSystem.g:2183:2: rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystem.g:2190:1: rule__Subscriber__Group__5__Impl : ( ( rule__Subscriber__Group_5__0 )? ) ;
    public final void rule__Subscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2194:1: ( ( ( rule__Subscriber__Group_5__0 )? ) )
            // InternalRosSystem.g:2195:1: ( ( rule__Subscriber__Group_5__0 )? )
            {
            // InternalRosSystem.g:2195:1: ( ( rule__Subscriber__Group_5__0 )? )
            // InternalRosSystem.g:2196:2: ( rule__Subscriber__Group_5__0 )?
            {
             before(grammarAccess.getSubscriberAccess().getGroup_5()); 
            // InternalRosSystem.g:2197:2: ( rule__Subscriber__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRosSystem.g:2197:3: rule__Subscriber__Group_5__0
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
    // InternalRosSystem.g:2205:1: rule__Subscriber__Group__6 : rule__Subscriber__Group__6__Impl ;
    public final void rule__Subscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2209:1: ( rule__Subscriber__Group__6__Impl )
            // InternalRosSystem.g:2210:2: rule__Subscriber__Group__6__Impl
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
    // InternalRosSystem.g:2216:1: rule__Subscriber__Group__6__Impl : ( '}' ) ;
    public final void rule__Subscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2220:1: ( ( '}' ) )
            // InternalRosSystem.g:2221:1: ( '}' )
            {
            // InternalRosSystem.g:2221:1: ( '}' )
            // InternalRosSystem.g:2222:2: '}'
            {
             before(grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:2232:1: rule__Subscriber__Group_3__0 : rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1 ;
    public final void rule__Subscriber__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2236:1: ( rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1 )
            // InternalRosSystem.g:2237:2: rule__Subscriber__Group_3__0__Impl rule__Subscriber__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2244:1: rule__Subscriber__Group_3__0__Impl : ( 'TopicName' ) ;
    public final void rule__Subscriber__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2248:1: ( ( 'TopicName' ) )
            // InternalRosSystem.g:2249:1: ( 'TopicName' )
            {
            // InternalRosSystem.g:2249:1: ( 'TopicName' )
            // InternalRosSystem.g:2250:2: 'TopicName'
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRosSystem.g:2259:1: rule__Subscriber__Group_3__1 : rule__Subscriber__Group_3__1__Impl ;
    public final void rule__Subscriber__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2263:1: ( rule__Subscriber__Group_3__1__Impl )
            // InternalRosSystem.g:2264:2: rule__Subscriber__Group_3__1__Impl
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
    // InternalRosSystem.g:2270:1: rule__Subscriber__Group_3__1__Impl : ( ( rule__Subscriber__TopicNameAssignment_3_1 ) ) ;
    public final void rule__Subscriber__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2274:1: ( ( ( rule__Subscriber__TopicNameAssignment_3_1 ) ) )
            // InternalRosSystem.g:2275:1: ( ( rule__Subscriber__TopicNameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:2275:1: ( ( rule__Subscriber__TopicNameAssignment_3_1 ) )
            // InternalRosSystem.g:2276:2: ( rule__Subscriber__TopicNameAssignment_3_1 )
            {
             before(grammarAccess.getSubscriberAccess().getTopicNameAssignment_3_1()); 
            // InternalRosSystem.g:2277:2: ( rule__Subscriber__TopicNameAssignment_3_1 )
            // InternalRosSystem.g:2277:3: rule__Subscriber__TopicNameAssignment_3_1
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
    // InternalRosSystem.g:2286:1: rule__Subscriber__Group_4__0 : rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1 ;
    public final void rule__Subscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2290:1: ( rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1 )
            // InternalRosSystem.g:2291:2: rule__Subscriber__Group_4__0__Impl rule__Subscriber__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2298:1: rule__Subscriber__Group_4__0__Impl : ( 'TopicRef' ) ;
    public final void rule__Subscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2302:1: ( ( 'TopicRef' ) )
            // InternalRosSystem.g:2303:1: ( 'TopicRef' )
            {
            // InternalRosSystem.g:2303:1: ( 'TopicRef' )
            // InternalRosSystem.g:2304:2: 'TopicRef'
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRosSystem.g:2313:1: rule__Subscriber__Group_4__1 : rule__Subscriber__Group_4__1__Impl ;
    public final void rule__Subscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2317:1: ( rule__Subscriber__Group_4__1__Impl )
            // InternalRosSystem.g:2318:2: rule__Subscriber__Group_4__1__Impl
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
    // InternalRosSystem.g:2324:1: rule__Subscriber__Group_4__1__Impl : ( ( rule__Subscriber__TopicRefAssignment_4_1 ) ) ;
    public final void rule__Subscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2328:1: ( ( ( rule__Subscriber__TopicRefAssignment_4_1 ) ) )
            // InternalRosSystem.g:2329:1: ( ( rule__Subscriber__TopicRefAssignment_4_1 ) )
            {
            // InternalRosSystem.g:2329:1: ( ( rule__Subscriber__TopicRefAssignment_4_1 ) )
            // InternalRosSystem.g:2330:2: ( rule__Subscriber__TopicRefAssignment_4_1 )
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefAssignment_4_1()); 
            // InternalRosSystem.g:2331:2: ( rule__Subscriber__TopicRefAssignment_4_1 )
            // InternalRosSystem.g:2331:3: rule__Subscriber__TopicRefAssignment_4_1
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
    // InternalRosSystem.g:2340:1: rule__Subscriber__Group_5__0 : rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1 ;
    public final void rule__Subscriber__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2344:1: ( rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1 )
            // InternalRosSystem.g:2345:2: rule__Subscriber__Group_5__0__Impl rule__Subscriber__Group_5__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:2352:1: rule__Subscriber__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__Subscriber__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2356:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:2357:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:2357:1: ( 'NameSpace' )
            // InternalRosSystem.g:2358:2: 'NameSpace'
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRosSystem.g:2367:1: rule__Subscriber__Group_5__1 : rule__Subscriber__Group_5__1__Impl ;
    public final void rule__Subscriber__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2371:1: ( rule__Subscriber__Group_5__1__Impl )
            // InternalRosSystem.g:2372:2: rule__Subscriber__Group_5__1__Impl
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
    // InternalRosSystem.g:2378:1: rule__Subscriber__Group_5__1__Impl : ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__Subscriber__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2382:1: ( ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) ) )
            // InternalRosSystem.g:2383:1: ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) )
            {
            // InternalRosSystem.g:2383:1: ( ( rule__Subscriber__NameSpaceAssignment_5_1 ) )
            // InternalRosSystem.g:2384:2: ( rule__Subscriber__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceAssignment_5_1()); 
            // InternalRosSystem.g:2385:2: ( rule__Subscriber__NameSpaceAssignment_5_1 )
            // InternalRosSystem.g:2385:3: rule__Subscriber__NameSpaceAssignment_5_1
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
    // InternalRosSystem.g:2394:1: rule__MessageDefinition__Group__0 : rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 ;
    public final void rule__MessageDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2398:1: ( rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1 )
            // InternalRosSystem.g:2399:2: rule__MessageDefinition__Group__0__Impl rule__MessageDefinition__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystem.g:2406:1: rule__MessageDefinition__Group__0__Impl : ( () ) ;
    public final void rule__MessageDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2410:1: ( ( () ) )
            // InternalRosSystem.g:2411:1: ( () )
            {
            // InternalRosSystem.g:2411:1: ( () )
            // InternalRosSystem.g:2412:2: ()
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0()); 
            // InternalRosSystem.g:2413:2: ()
            // InternalRosSystem.g:2413:3: 
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
    // InternalRosSystem.g:2421:1: rule__MessageDefinition__Group__1 : rule__MessageDefinition__Group__1__Impl ;
    public final void rule__MessageDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2425:1: ( rule__MessageDefinition__Group__1__Impl )
            // InternalRosSystem.g:2426:2: rule__MessageDefinition__Group__1__Impl
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
    // InternalRosSystem.g:2432:1: rule__MessageDefinition__Group__1__Impl : ( 'MessageDefinition' ) ;
    public final void rule__MessageDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2436:1: ( ( 'MessageDefinition' ) )
            // InternalRosSystem.g:2437:1: ( 'MessageDefinition' )
            {
            // InternalRosSystem.g:2437:1: ( 'MessageDefinition' )
            // InternalRosSystem.g:2438:2: 'MessageDefinition'
            {
             before(grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalRosSystem.g:2448:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2452:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalRosSystem.g:2453:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRosSystem.g:2460:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2464:1: ( ( () ) )
            // InternalRosSystem.g:2465:1: ( () )
            {
            // InternalRosSystem.g:2465:1: ( () )
            // InternalRosSystem.g:2466:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalRosSystem.g:2467:2: ()
            // InternalRosSystem.g:2467:3: 
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
    // InternalRosSystem.g:2475:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2479:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalRosSystem.g:2480:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2487:1: rule__GlobalNamespace__Group__1__Impl : ( 'GlobalNamespace' ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2491:1: ( ( 'GlobalNamespace' ) )
            // InternalRosSystem.g:2492:1: ( 'GlobalNamespace' )
            {
            // InternalRosSystem.g:2492:1: ( 'GlobalNamespace' )
            // InternalRosSystem.g:2493:2: 'GlobalNamespace'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRosSystem.g:2502:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2506:1: ( rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 )
            // InternalRosSystem.g:2507:2: rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:2514:1: rule__GlobalNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2518:1: ( ( '{' ) )
            // InternalRosSystem.g:2519:1: ( '{' )
            {
            // InternalRosSystem.g:2519:1: ( '{' )
            // InternalRosSystem.g:2520:2: '{'
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
    // InternalRosSystem.g:2529:1: rule__GlobalNamespace__Group__3 : rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 ;
    public final void rule__GlobalNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2533:1: ( rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 )
            // InternalRosSystem.g:2534:2: rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:2541:1: rule__GlobalNamespace__Group__3__Impl : ( ( rule__GlobalNamespace__Group_3__0 )? ) ;
    public final void rule__GlobalNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2545:1: ( ( ( rule__GlobalNamespace__Group_3__0 )? ) )
            // InternalRosSystem.g:2546:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            {
            // InternalRosSystem.g:2546:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            // InternalRosSystem.g:2547:2: ( rule__GlobalNamespace__Group_3__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 
            // InternalRosSystem.g:2548:2: ( rule__GlobalNamespace__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystem.g:2548:3: rule__GlobalNamespace__Group_3__0
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
    // InternalRosSystem.g:2556:1: rule__GlobalNamespace__Group__4 : rule__GlobalNamespace__Group__4__Impl ;
    public final void rule__GlobalNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2560:1: ( rule__GlobalNamespace__Group__4__Impl )
            // InternalRosSystem.g:2561:2: rule__GlobalNamespace__Group__4__Impl
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
    // InternalRosSystem.g:2567:1: rule__GlobalNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2571:1: ( ( '}' ) )
            // InternalRosSystem.g:2572:1: ( '}' )
            {
            // InternalRosSystem.g:2572:1: ( '}' )
            // InternalRosSystem.g:2573:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:2583:1: rule__GlobalNamespace__Group_3__0 : rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 ;
    public final void rule__GlobalNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2587:1: ( rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 )
            // InternalRosSystem.g:2588:2: rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2595:1: rule__GlobalNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__GlobalNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2599:1: ( ( 'parts' ) )
            // InternalRosSystem.g:2600:1: ( 'parts' )
            {
            // InternalRosSystem.g:2600:1: ( 'parts' )
            // InternalRosSystem.g:2601:2: 'parts'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRosSystem.g:2610:1: rule__GlobalNamespace__Group_3__1 : rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 ;
    public final void rule__GlobalNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2614:1: ( rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 )
            // InternalRosSystem.g:2615:2: rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__GlobalNamespace__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__2();

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
    // InternalRosSystem.g:2622:1: rule__GlobalNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__GlobalNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2626:1: ( ( '{' ) )
            // InternalRosSystem.g:2627:1: ( '{' )
            {
            // InternalRosSystem.g:2627:1: ( '{' )
            // InternalRosSystem.g:2628:2: '{'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 

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


    // $ANTLR start "rule__GlobalNamespace__Group_3__2"
    // InternalRosSystem.g:2637:1: rule__GlobalNamespace__Group_3__2 : rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 ;
    public final void rule__GlobalNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2641:1: ( rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 )
            // InternalRosSystem.g:2642:2: rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__GlobalNamespace__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__3();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__2"


    // $ANTLR start "rule__GlobalNamespace__Group_3__2__Impl"
    // InternalRosSystem.g:2649:1: rule__GlobalNamespace__Group_3__2__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__GlobalNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2653:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) )
            // InternalRosSystem.g:2654:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            {
            // InternalRosSystem.g:2654:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            // InternalRosSystem.g:2655:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalRosSystem.g:2656:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            // InternalRosSystem.g:2656:3: rule__GlobalNamespace__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__3"
    // InternalRosSystem.g:2664:1: rule__GlobalNamespace__Group_3__3 : rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 ;
    public final void rule__GlobalNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2668:1: ( rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 )
            // InternalRosSystem.g:2669:2: rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__GlobalNamespace__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__4();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__3"


    // $ANTLR start "rule__GlobalNamespace__Group_3__3__Impl"
    // InternalRosSystem.g:2676:1: rule__GlobalNamespace__Group_3__3__Impl : ( ( rule__GlobalNamespace__Group_3_3__0 )* ) ;
    public final void rule__GlobalNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2680:1: ( ( ( rule__GlobalNamespace__Group_3_3__0 )* ) )
            // InternalRosSystem.g:2681:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            {
            // InternalRosSystem.g:2681:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            // InternalRosSystem.g:2682:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 
            // InternalRosSystem.g:2683:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==18) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRosSystem.g:2683:3: rule__GlobalNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__GlobalNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__4"
    // InternalRosSystem.g:2691:1: rule__GlobalNamespace__Group_3__4 : rule__GlobalNamespace__Group_3__4__Impl ;
    public final void rule__GlobalNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2695:1: ( rule__GlobalNamespace__Group_3__4__Impl )
            // InternalRosSystem.g:2696:2: rule__GlobalNamespace__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__4__Impl();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__4"


    // $ANTLR start "rule__GlobalNamespace__Group_3__4__Impl"
    // InternalRosSystem.g:2702:1: rule__GlobalNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__GlobalNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2706:1: ( ( '}' ) )
            // InternalRosSystem.g:2707:1: ( '}' )
            {
            // InternalRosSystem.g:2707:1: ( '}' )
            // InternalRosSystem.g:2708:2: '}'
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__GlobalNamespace__Group_3__4__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__0"
    // InternalRosSystem.g:2718:1: rule__GlobalNamespace__Group_3_3__0 : rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 ;
    public final void rule__GlobalNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2722:1: ( rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 )
            // InternalRosSystem.g:2723:2: rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_18);
            rule__GlobalNamespace__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3_3__1();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__0"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__0__Impl"
    // InternalRosSystem.g:2730:1: rule__GlobalNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__GlobalNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2734:1: ( ( ',' ) )
            // InternalRosSystem.g:2735:1: ( ',' )
            {
            // InternalRosSystem.g:2735:1: ( ',' )
            // InternalRosSystem.g:2736:2: ','
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__1"
    // InternalRosSystem.g:2745:1: rule__GlobalNamespace__Group_3_3__1 : rule__GlobalNamespace__Group_3_3__1__Impl ;
    public final void rule__GlobalNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2749:1: ( rule__GlobalNamespace__Group_3_3__1__Impl )
            // InternalRosSystem.g:2750:2: rule__GlobalNamespace__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__1"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__1__Impl"
    // InternalRosSystem.g:2756:1: rule__GlobalNamespace__Group_3_3__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__GlobalNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2760:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalRosSystem.g:2761:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalRosSystem.g:2761:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            // InternalRosSystem.g:2762:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalRosSystem.g:2763:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            // InternalRosSystem.g:2763:3: rule__GlobalNamespace__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0"
    // InternalRosSystem.g:2772:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2776:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalRosSystem.g:2777:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystem.g:2784:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2788:1: ( ( () ) )
            // InternalRosSystem.g:2789:1: ( () )
            {
            // InternalRosSystem.g:2789:1: ( () )
            // InternalRosSystem.g:2790:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalRosSystem.g:2791:2: ()
            // InternalRosSystem.g:2791:3: 
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
    // InternalRosSystem.g:2799:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2803:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalRosSystem.g:2804:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2811:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( 'RelativeNamespace' ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2815:1: ( ( 'RelativeNamespace' ) )
            // InternalRosSystem.g:2816:1: ( 'RelativeNamespace' )
            {
            // InternalRosSystem.g:2816:1: ( 'RelativeNamespace' )
            // InternalRosSystem.g:2817:2: 'RelativeNamespace'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRosSystem.g:2826:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2830:1: ( rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 )
            // InternalRosSystem.g:2831:2: rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:2838:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2842:1: ( ( '{' ) )
            // InternalRosSystem.g:2843:1: ( '{' )
            {
            // InternalRosSystem.g:2843:1: ( '{' )
            // InternalRosSystem.g:2844:2: '{'
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
    // InternalRosSystem.g:2853:1: rule__RelativeNamespace_Impl__Group__3 : rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 ;
    public final void rule__RelativeNamespace_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2857:1: ( rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 )
            // InternalRosSystem.g:2858:2: rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:2865:1: rule__RelativeNamespace_Impl__Group__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2869:1: ( ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) )
            // InternalRosSystem.g:2870:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            {
            // InternalRosSystem.g:2870:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            // InternalRosSystem.g:2871:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 
            // InternalRosSystem.g:2872:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystem.g:2872:3: rule__RelativeNamespace_Impl__Group_3__0
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
    // InternalRosSystem.g:2880:1: rule__RelativeNamespace_Impl__Group__4 : rule__RelativeNamespace_Impl__Group__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2884:1: ( rule__RelativeNamespace_Impl__Group__4__Impl )
            // InternalRosSystem.g:2885:2: rule__RelativeNamespace_Impl__Group__4__Impl
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
    // InternalRosSystem.g:2891:1: rule__RelativeNamespace_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2895:1: ( ( '}' ) )
            // InternalRosSystem.g:2896:1: ( '}' )
            {
            // InternalRosSystem.g:2896:1: ( '}' )
            // InternalRosSystem.g:2897:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:2907:1: rule__RelativeNamespace_Impl__Group_3__0 : rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2911:1: ( rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 )
            // InternalRosSystem.g:2912:2: rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:2919:1: rule__RelativeNamespace_Impl__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2923:1: ( ( 'parts' ) )
            // InternalRosSystem.g:2924:1: ( 'parts' )
            {
            // InternalRosSystem.g:2924:1: ( 'parts' )
            // InternalRosSystem.g:2925:2: 'parts'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRosSystem.g:2934:1: rule__RelativeNamespace_Impl__Group_3__1 : rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 ;
    public final void rule__RelativeNamespace_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2938:1: ( rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 )
            // InternalRosSystem.g:2939:2: rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__RelativeNamespace_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__2();

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
    // InternalRosSystem.g:2946:1: rule__RelativeNamespace_Impl__Group_3__1__Impl : ( '{' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2950:1: ( ( '{' ) )
            // InternalRosSystem.g:2951:1: ( '{' )
            {
            // InternalRosSystem.g:2951:1: ( '{' )
            // InternalRosSystem.g:2952:2: '{'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 

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


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__2"
    // InternalRosSystem.g:2961:1: rule__RelativeNamespace_Impl__Group_3__2 : rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 ;
    public final void rule__RelativeNamespace_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2965:1: ( rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 )
            // InternalRosSystem.g:2966:2: rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__RelativeNamespace_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__3();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__2__Impl"
    // InternalRosSystem.g:2973:1: rule__RelativeNamespace_Impl__Group_3__2__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2977:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) )
            // InternalRosSystem.g:2978:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            {
            // InternalRosSystem.g:2978:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            // InternalRosSystem.g:2979:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 
            // InternalRosSystem.g:2980:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            // InternalRosSystem.g:2980:3: rule__RelativeNamespace_Impl__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__3"
    // InternalRosSystem.g:2988:1: rule__RelativeNamespace_Impl__Group_3__3 : rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 ;
    public final void rule__RelativeNamespace_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2992:1: ( rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 )
            // InternalRosSystem.g:2993:2: rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__RelativeNamespace_Impl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__4();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__3__Impl"
    // InternalRosSystem.g:3000:1: rule__RelativeNamespace_Impl__Group_3__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3004:1: ( ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) )
            // InternalRosSystem.g:3005:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            {
            // InternalRosSystem.g:3005:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            // InternalRosSystem.g:3006:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 
            // InternalRosSystem.g:3007:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystem.g:3007:3: rule__RelativeNamespace_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RelativeNamespace_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__4"
    // InternalRosSystem.g:3015:1: rule__RelativeNamespace_Impl__Group_3__4 : rule__RelativeNamespace_Impl__Group_3__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3019:1: ( rule__RelativeNamespace_Impl__Group_3__4__Impl )
            // InternalRosSystem.g:3020:2: rule__RelativeNamespace_Impl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__4__Impl();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__4"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__4__Impl"
    // InternalRosSystem.g:3026:1: rule__RelativeNamespace_Impl__Group_3__4__Impl : ( '}' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3030:1: ( ( '}' ) )
            // InternalRosSystem.g:3031:1: ( '}' )
            {
            // InternalRosSystem.g:3031:1: ( '}' )
            // InternalRosSystem.g:3032:2: '}'
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__4__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__0"
    // InternalRosSystem.g:3042:1: rule__RelativeNamespace_Impl__Group_3_3__0 : rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3046:1: ( rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 )
            // InternalRosSystem.g:3047:2: rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_18);
            rule__RelativeNamespace_Impl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3_3__1();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__0__Impl"
    // InternalRosSystem.g:3054:1: rule__RelativeNamespace_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3058:1: ( ( ',' ) )
            // InternalRosSystem.g:3059:1: ( ',' )
            {
            // InternalRosSystem.g:3059:1: ( ',' )
            // InternalRosSystem.g:3060:2: ','
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__1"
    // InternalRosSystem.g:3069:1: rule__RelativeNamespace_Impl__Group_3_3__1 : rule__RelativeNamespace_Impl__Group_3_3__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3073:1: ( rule__RelativeNamespace_Impl__Group_3_3__1__Impl )
            // InternalRosSystem.g:3074:2: rule__RelativeNamespace_Impl__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__1__Impl"
    // InternalRosSystem.g:3080:1: rule__RelativeNamespace_Impl__Group_3_3__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3084:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) )
            // InternalRosSystem.g:3085:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            {
            // InternalRosSystem.g:3085:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            // InternalRosSystem.g:3086:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 
            // InternalRosSystem.g:3087:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            // InternalRosSystem.g:3087:3: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__0"
    // InternalRosSystem.g:3096:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3100:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalRosSystem.g:3101:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystem.g:3108:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3112:1: ( ( () ) )
            // InternalRosSystem.g:3113:1: ( () )
            {
            // InternalRosSystem.g:3113:1: ( () )
            // InternalRosSystem.g:3114:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalRosSystem.g:3115:2: ()
            // InternalRosSystem.g:3115:3: 
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
    // InternalRosSystem.g:3123:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3127:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalRosSystem.g:3128:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:3135:1: rule__PrivateNamespace__Group__1__Impl : ( 'PrivateNamespace' ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3139:1: ( ( 'PrivateNamespace' ) )
            // InternalRosSystem.g:3140:1: ( 'PrivateNamespace' )
            {
            // InternalRosSystem.g:3140:1: ( 'PrivateNamespace' )
            // InternalRosSystem.g:3141:2: 'PrivateNamespace'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRosSystem.g:3150:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3154:1: ( rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 )
            // InternalRosSystem.g:3155:2: rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:3162:1: rule__PrivateNamespace__Group__2__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3166:1: ( ( '{' ) )
            // InternalRosSystem.g:3167:1: ( '{' )
            {
            // InternalRosSystem.g:3167:1: ( '{' )
            // InternalRosSystem.g:3168:2: '{'
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
    // InternalRosSystem.g:3177:1: rule__PrivateNamespace__Group__3 : rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 ;
    public final void rule__PrivateNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3181:1: ( rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 )
            // InternalRosSystem.g:3182:2: rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystem.g:3189:1: rule__PrivateNamespace__Group__3__Impl : ( ( rule__PrivateNamespace__Group_3__0 )? ) ;
    public final void rule__PrivateNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3193:1: ( ( ( rule__PrivateNamespace__Group_3__0 )? ) )
            // InternalRosSystem.g:3194:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            {
            // InternalRosSystem.g:3194:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            // InternalRosSystem.g:3195:2: ( rule__PrivateNamespace__Group_3__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 
            // InternalRosSystem.g:3196:2: ( rule__PrivateNamespace__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosSystem.g:3196:3: rule__PrivateNamespace__Group_3__0
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
    // InternalRosSystem.g:3204:1: rule__PrivateNamespace__Group__4 : rule__PrivateNamespace__Group__4__Impl ;
    public final void rule__PrivateNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3208:1: ( rule__PrivateNamespace__Group__4__Impl )
            // InternalRosSystem.g:3209:2: rule__PrivateNamespace__Group__4__Impl
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
    // InternalRosSystem.g:3215:1: rule__PrivateNamespace__Group__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3219:1: ( ( '}' ) )
            // InternalRosSystem.g:3220:1: ( '}' )
            {
            // InternalRosSystem.g:3220:1: ( '}' )
            // InternalRosSystem.g:3221:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:3231:1: rule__PrivateNamespace__Group_3__0 : rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 ;
    public final void rule__PrivateNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3235:1: ( rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 )
            // InternalRosSystem.g:3236:2: rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:3243:1: rule__PrivateNamespace__Group_3__0__Impl : ( 'parts' ) ;
    public final void rule__PrivateNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3247:1: ( ( 'parts' ) )
            // InternalRosSystem.g:3248:1: ( 'parts' )
            {
            // InternalRosSystem.g:3248:1: ( 'parts' )
            // InternalRosSystem.g:3249:2: 'parts'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRosSystem.g:3258:1: rule__PrivateNamespace__Group_3__1 : rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 ;
    public final void rule__PrivateNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3262:1: ( rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 )
            // InternalRosSystem.g:3263:2: rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__PrivateNamespace__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__2();

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
    // InternalRosSystem.g:3270:1: rule__PrivateNamespace__Group_3__1__Impl : ( '{' ) ;
    public final void rule__PrivateNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3274:1: ( ( '{' ) )
            // InternalRosSystem.g:3275:1: ( '{' )
            {
            // InternalRosSystem.g:3275:1: ( '{' )
            // InternalRosSystem.g:3276:2: '{'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 

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


    // $ANTLR start "rule__PrivateNamespace__Group_3__2"
    // InternalRosSystem.g:3285:1: rule__PrivateNamespace__Group_3__2 : rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 ;
    public final void rule__PrivateNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3289:1: ( rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 )
            // InternalRosSystem.g:3290:2: rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__PrivateNamespace__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__3();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__2"


    // $ANTLR start "rule__PrivateNamespace__Group_3__2__Impl"
    // InternalRosSystem.g:3297:1: rule__PrivateNamespace__Group_3__2__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__PrivateNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3301:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) )
            // InternalRosSystem.g:3302:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            {
            // InternalRosSystem.g:3302:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            // InternalRosSystem.g:3303:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalRosSystem.g:3304:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            // InternalRosSystem.g:3304:3: rule__PrivateNamespace__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__3"
    // InternalRosSystem.g:3312:1: rule__PrivateNamespace__Group_3__3 : rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 ;
    public final void rule__PrivateNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3316:1: ( rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 )
            // InternalRosSystem.g:3317:2: rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__PrivateNamespace__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__4();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__3"


    // $ANTLR start "rule__PrivateNamespace__Group_3__3__Impl"
    // InternalRosSystem.g:3324:1: rule__PrivateNamespace__Group_3__3__Impl : ( ( rule__PrivateNamespace__Group_3_3__0 )* ) ;
    public final void rule__PrivateNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3328:1: ( ( ( rule__PrivateNamespace__Group_3_3__0 )* ) )
            // InternalRosSystem.g:3329:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            {
            // InternalRosSystem.g:3329:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            // InternalRosSystem.g:3330:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 
            // InternalRosSystem.g:3331:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRosSystem.g:3331:3: rule__PrivateNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PrivateNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__4"
    // InternalRosSystem.g:3339:1: rule__PrivateNamespace__Group_3__4 : rule__PrivateNamespace__Group_3__4__Impl ;
    public final void rule__PrivateNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3343:1: ( rule__PrivateNamespace__Group_3__4__Impl )
            // InternalRosSystem.g:3344:2: rule__PrivateNamespace__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__4__Impl();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__4"


    // $ANTLR start "rule__PrivateNamespace__Group_3__4__Impl"
    // InternalRosSystem.g:3350:1: rule__PrivateNamespace__Group_3__4__Impl : ( '}' ) ;
    public final void rule__PrivateNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3354:1: ( ( '}' ) )
            // InternalRosSystem.g:3355:1: ( '}' )
            {
            // InternalRosSystem.g:3355:1: ( '}' )
            // InternalRosSystem.g:3356:2: '}'
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__PrivateNamespace__Group_3__4__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__0"
    // InternalRosSystem.g:3366:1: rule__PrivateNamespace__Group_3_3__0 : rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 ;
    public final void rule__PrivateNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3370:1: ( rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 )
            // InternalRosSystem.g:3371:2: rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_18);
            rule__PrivateNamespace__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3_3__1();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__0"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__0__Impl"
    // InternalRosSystem.g:3378:1: rule__PrivateNamespace__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__PrivateNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3382:1: ( ( ',' ) )
            // InternalRosSystem.g:3383:1: ( ',' )
            {
            // InternalRosSystem.g:3383:1: ( ',' )
            // InternalRosSystem.g:3384:2: ','
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__1"
    // InternalRosSystem.g:3393:1: rule__PrivateNamespace__Group_3_3__1 : rule__PrivateNamespace__Group_3_3__1__Impl ;
    public final void rule__PrivateNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3397:1: ( rule__PrivateNamespace__Group_3_3__1__Impl )
            // InternalRosSystem.g:3398:2: rule__PrivateNamespace__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__1"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__1__Impl"
    // InternalRosSystem.g:3404:1: rule__PrivateNamespace__Group_3_3__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__PrivateNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3408:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalRosSystem.g:3409:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalRosSystem.g:3409:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            // InternalRosSystem.g:3410:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalRosSystem.g:3411:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            // InternalRosSystem.g:3411:3: rule__PrivateNamespace__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__1__Impl"


    // $ANTLR start "rule__ServiceServer__Group__0"
    // InternalRosSystem.g:3420:1: rule__ServiceServer__Group__0 : rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1 ;
    public final void rule__ServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3424:1: ( rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1 )
            // InternalRosSystem.g:3425:2: rule__ServiceServer__Group__0__Impl rule__ServiceServer__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:3432:1: rule__ServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__ServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3436:1: ( ( () ) )
            // InternalRosSystem.g:3437:1: ( () )
            {
            // InternalRosSystem.g:3437:1: ( () )
            // InternalRosSystem.g:3438:2: ()
            {
             before(grammarAccess.getServiceServerAccess().getServiceServerAction_0()); 
            // InternalRosSystem.g:3439:2: ()
            // InternalRosSystem.g:3439:3: 
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
    // InternalRosSystem.g:3447:1: rule__ServiceServer__Group__1 : rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2 ;
    public final void rule__ServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3451:1: ( rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2 )
            // InternalRosSystem.g:3452:2: rule__ServiceServer__Group__1__Impl rule__ServiceServer__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:3459:1: rule__ServiceServer__Group__1__Impl : ( 'ServiceServer' ) ;
    public final void rule__ServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3463:1: ( ( 'ServiceServer' ) )
            // InternalRosSystem.g:3464:1: ( 'ServiceServer' )
            {
            // InternalRosSystem.g:3464:1: ( 'ServiceServer' )
            // InternalRosSystem.g:3465:2: 'ServiceServer'
            {
             before(grammarAccess.getServiceServerAccess().getServiceServerKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRosSystem.g:3474:1: rule__ServiceServer__Group__2 : rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3 ;
    public final void rule__ServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3478:1: ( rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3 )
            // InternalRosSystem.g:3479:2: rule__ServiceServer__Group__2__Impl rule__ServiceServer__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3486:1: rule__ServiceServer__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3490:1: ( ( '{' ) )
            // InternalRosSystem.g:3491:1: ( '{' )
            {
            // InternalRosSystem.g:3491:1: ( '{' )
            // InternalRosSystem.g:3492:2: '{'
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
    // InternalRosSystem.g:3501:1: rule__ServiceServer__Group__3 : rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4 ;
    public final void rule__ServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3505:1: ( rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4 )
            // InternalRosSystem.g:3506:2: rule__ServiceServer__Group__3__Impl rule__ServiceServer__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3513:1: rule__ServiceServer__Group__3__Impl : ( ( rule__ServiceServer__Group_3__0 )? ) ;
    public final void rule__ServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3517:1: ( ( ( rule__ServiceServer__Group_3__0 )? ) )
            // InternalRosSystem.g:3518:1: ( ( rule__ServiceServer__Group_3__0 )? )
            {
            // InternalRosSystem.g:3518:1: ( ( rule__ServiceServer__Group_3__0 )? )
            // InternalRosSystem.g:3519:2: ( rule__ServiceServer__Group_3__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_3()); 
            // InternalRosSystem.g:3520:2: ( rule__ServiceServer__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:3520:3: rule__ServiceServer__Group_3__0
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
    // InternalRosSystem.g:3528:1: rule__ServiceServer__Group__4 : rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5 ;
    public final void rule__ServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3532:1: ( rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5 )
            // InternalRosSystem.g:3533:2: rule__ServiceServer__Group__4__Impl rule__ServiceServer__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3540:1: rule__ServiceServer__Group__4__Impl : ( ( rule__ServiceServer__Group_4__0 )? ) ;
    public final void rule__ServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3544:1: ( ( ( rule__ServiceServer__Group_4__0 )? ) )
            // InternalRosSystem.g:3545:1: ( ( rule__ServiceServer__Group_4__0 )? )
            {
            // InternalRosSystem.g:3545:1: ( ( rule__ServiceServer__Group_4__0 )? )
            // InternalRosSystem.g:3546:2: ( rule__ServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_4()); 
            // InternalRosSystem.g:3547:2: ( rule__ServiceServer__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystem.g:3547:3: rule__ServiceServer__Group_4__0
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
    // InternalRosSystem.g:3555:1: rule__ServiceServer__Group__5 : rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6 ;
    public final void rule__ServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3559:1: ( rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6 )
            // InternalRosSystem.g:3560:2: rule__ServiceServer__Group__5__Impl rule__ServiceServer__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3567:1: rule__ServiceServer__Group__5__Impl : ( ( rule__ServiceServer__Group_5__0 )? ) ;
    public final void rule__ServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3571:1: ( ( ( rule__ServiceServer__Group_5__0 )? ) )
            // InternalRosSystem.g:3572:1: ( ( rule__ServiceServer__Group_5__0 )? )
            {
            // InternalRosSystem.g:3572:1: ( ( rule__ServiceServer__Group_5__0 )? )
            // InternalRosSystem.g:3573:2: ( rule__ServiceServer__Group_5__0 )?
            {
             before(grammarAccess.getServiceServerAccess().getGroup_5()); 
            // InternalRosSystem.g:3574:2: ( rule__ServiceServer__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystem.g:3574:3: rule__ServiceServer__Group_5__0
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
    // InternalRosSystem.g:3582:1: rule__ServiceServer__Group__6 : rule__ServiceServer__Group__6__Impl ;
    public final void rule__ServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3586:1: ( rule__ServiceServer__Group__6__Impl )
            // InternalRosSystem.g:3587:2: rule__ServiceServer__Group__6__Impl
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
    // InternalRosSystem.g:3593:1: rule__ServiceServer__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3597:1: ( ( '}' ) )
            // InternalRosSystem.g:3598:1: ( '}' )
            {
            // InternalRosSystem.g:3598:1: ( '}' )
            // InternalRosSystem.g:3599:2: '}'
            {
             before(grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:3609:1: rule__ServiceServer__Group_3__0 : rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1 ;
    public final void rule__ServiceServer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3613:1: ( rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1 )
            // InternalRosSystem.g:3614:2: rule__ServiceServer__Group_3__0__Impl rule__ServiceServer__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3621:1: rule__ServiceServer__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__ServiceServer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3625:1: ( ( 'ServiceName' ) )
            // InternalRosSystem.g:3626:1: ( 'ServiceName' )
            {
            // InternalRosSystem.g:3626:1: ( 'ServiceName' )
            // InternalRosSystem.g:3627:2: 'ServiceName'
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRosSystem.g:3636:1: rule__ServiceServer__Group_3__1 : rule__ServiceServer__Group_3__1__Impl ;
    public final void rule__ServiceServer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3640:1: ( rule__ServiceServer__Group_3__1__Impl )
            // InternalRosSystem.g:3641:2: rule__ServiceServer__Group_3__1__Impl
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
    // InternalRosSystem.g:3647:1: rule__ServiceServer__Group_3__1__Impl : ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__ServiceServer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3651:1: ( ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) ) )
            // InternalRosSystem.g:3652:1: ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:3652:1: ( ( rule__ServiceServer__ServiceNameAssignment_3_1 ) )
            // InternalRosSystem.g:3653:2: ( rule__ServiceServer__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getServiceServerAccess().getServiceNameAssignment_3_1()); 
            // InternalRosSystem.g:3654:2: ( rule__ServiceServer__ServiceNameAssignment_3_1 )
            // InternalRosSystem.g:3654:3: rule__ServiceServer__ServiceNameAssignment_3_1
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
    // InternalRosSystem.g:3663:1: rule__ServiceServer__Group_4__0 : rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1 ;
    public final void rule__ServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3667:1: ( rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1 )
            // InternalRosSystem.g:3668:2: rule__ServiceServer__Group_4__0__Impl rule__ServiceServer__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3675:1: rule__ServiceServer__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__ServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3679:1: ( ( 'SrvRef' ) )
            // InternalRosSystem.g:3680:1: ( 'SrvRef' )
            {
            // InternalRosSystem.g:3680:1: ( 'SrvRef' )
            // InternalRosSystem.g:3681:2: 'SrvRef'
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:3690:1: rule__ServiceServer__Group_4__1 : rule__ServiceServer__Group_4__1__Impl ;
    public final void rule__ServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3694:1: ( rule__ServiceServer__Group_4__1__Impl )
            // InternalRosSystem.g:3695:2: rule__ServiceServer__Group_4__1__Impl
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
    // InternalRosSystem.g:3701:1: rule__ServiceServer__Group_4__1__Impl : ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) ) ;
    public final void rule__ServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3705:1: ( ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) ) )
            // InternalRosSystem.g:3706:1: ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) )
            {
            // InternalRosSystem.g:3706:1: ( ( rule__ServiceServer__SrvRefAssignment_4_1 ) )
            // InternalRosSystem.g:3707:2: ( rule__ServiceServer__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefAssignment_4_1()); 
            // InternalRosSystem.g:3708:2: ( rule__ServiceServer__SrvRefAssignment_4_1 )
            // InternalRosSystem.g:3708:3: rule__ServiceServer__SrvRefAssignment_4_1
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
    // InternalRosSystem.g:3717:1: rule__ServiceServer__Group_5__0 : rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1 ;
    public final void rule__ServiceServer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3721:1: ( rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1 )
            // InternalRosSystem.g:3722:2: rule__ServiceServer__Group_5__0__Impl rule__ServiceServer__Group_5__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3729:1: rule__ServiceServer__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ServiceServer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3733:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:3734:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:3734:1: ( 'NameSpace' )
            // InternalRosSystem.g:3735:2: 'NameSpace'
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRosSystem.g:3744:1: rule__ServiceServer__Group_5__1 : rule__ServiceServer__Group_5__1__Impl ;
    public final void rule__ServiceServer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3748:1: ( rule__ServiceServer__Group_5__1__Impl )
            // InternalRosSystem.g:3749:2: rule__ServiceServer__Group_5__1__Impl
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
    // InternalRosSystem.g:3755:1: rule__ServiceServer__Group_5__1__Impl : ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__ServiceServer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3759:1: ( ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) ) )
            // InternalRosSystem.g:3760:1: ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) )
            {
            // InternalRosSystem.g:3760:1: ( ( rule__ServiceServer__NameSpaceAssignment_5_1 ) )
            // InternalRosSystem.g:3761:2: ( rule__ServiceServer__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceAssignment_5_1()); 
            // InternalRosSystem.g:3762:2: ( rule__ServiceServer__NameSpaceAssignment_5_1 )
            // InternalRosSystem.g:3762:3: rule__ServiceServer__NameSpaceAssignment_5_1
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
    // InternalRosSystem.g:3771:1: rule__ServiceClient__Group__0 : rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 ;
    public final void rule__ServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3775:1: ( rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1 )
            // InternalRosSystem.g:3776:2: rule__ServiceClient__Group__0__Impl rule__ServiceClient__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystem.g:3783:1: rule__ServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__ServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3787:1: ( ( () ) )
            // InternalRosSystem.g:3788:1: ( () )
            {
            // InternalRosSystem.g:3788:1: ( () )
            // InternalRosSystem.g:3789:2: ()
            {
             before(grammarAccess.getServiceClientAccess().getServiceClientAction_0()); 
            // InternalRosSystem.g:3790:2: ()
            // InternalRosSystem.g:3790:3: 
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
    // InternalRosSystem.g:3798:1: rule__ServiceClient__Group__1 : rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 ;
    public final void rule__ServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3802:1: ( rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2 )
            // InternalRosSystem.g:3803:2: rule__ServiceClient__Group__1__Impl rule__ServiceClient__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystem.g:3810:1: rule__ServiceClient__Group__1__Impl : ( 'ServiceClient' ) ;
    public final void rule__ServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3814:1: ( ( 'ServiceClient' ) )
            // InternalRosSystem.g:3815:1: ( 'ServiceClient' )
            {
            // InternalRosSystem.g:3815:1: ( 'ServiceClient' )
            // InternalRosSystem.g:3816:2: 'ServiceClient'
            {
             before(grammarAccess.getServiceClientAccess().getServiceClientKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRosSystem.g:3825:1: rule__ServiceClient__Group__2 : rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 ;
    public final void rule__ServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3829:1: ( rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3 )
            // InternalRosSystem.g:3830:2: rule__ServiceClient__Group__2__Impl rule__ServiceClient__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3837:1: rule__ServiceClient__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3841:1: ( ( '{' ) )
            // InternalRosSystem.g:3842:1: ( '{' )
            {
            // InternalRosSystem.g:3842:1: ( '{' )
            // InternalRosSystem.g:3843:2: '{'
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
    // InternalRosSystem.g:3852:1: rule__ServiceClient__Group__3 : rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 ;
    public final void rule__ServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3856:1: ( rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4 )
            // InternalRosSystem.g:3857:2: rule__ServiceClient__Group__3__Impl rule__ServiceClient__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3864:1: rule__ServiceClient__Group__3__Impl : ( ( rule__ServiceClient__Group_3__0 )? ) ;
    public final void rule__ServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3868:1: ( ( ( rule__ServiceClient__Group_3__0 )? ) )
            // InternalRosSystem.g:3869:1: ( ( rule__ServiceClient__Group_3__0 )? )
            {
            // InternalRosSystem.g:3869:1: ( ( rule__ServiceClient__Group_3__0 )? )
            // InternalRosSystem.g:3870:2: ( rule__ServiceClient__Group_3__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_3()); 
            // InternalRosSystem.g:3871:2: ( rule__ServiceClient__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystem.g:3871:3: rule__ServiceClient__Group_3__0
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
    // InternalRosSystem.g:3879:1: rule__ServiceClient__Group__4 : rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 ;
    public final void rule__ServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3883:1: ( rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5 )
            // InternalRosSystem.g:3884:2: rule__ServiceClient__Group__4__Impl rule__ServiceClient__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3891:1: rule__ServiceClient__Group__4__Impl : ( ( rule__ServiceClient__Group_4__0 )? ) ;
    public final void rule__ServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3895:1: ( ( ( rule__ServiceClient__Group_4__0 )? ) )
            // InternalRosSystem.g:3896:1: ( ( rule__ServiceClient__Group_4__0 )? )
            {
            // InternalRosSystem.g:3896:1: ( ( rule__ServiceClient__Group_4__0 )? )
            // InternalRosSystem.g:3897:2: ( rule__ServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_4()); 
            // InternalRosSystem.g:3898:2: ( rule__ServiceClient__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystem.g:3898:3: rule__ServiceClient__Group_4__0
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
    // InternalRosSystem.g:3906:1: rule__ServiceClient__Group__5 : rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 ;
    public final void rule__ServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3910:1: ( rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6 )
            // InternalRosSystem.g:3911:2: rule__ServiceClient__Group__5__Impl rule__ServiceClient__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystem.g:3918:1: rule__ServiceClient__Group__5__Impl : ( ( rule__ServiceClient__Group_5__0 )? ) ;
    public final void rule__ServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3922:1: ( ( ( rule__ServiceClient__Group_5__0 )? ) )
            // InternalRosSystem.g:3923:1: ( ( rule__ServiceClient__Group_5__0 )? )
            {
            // InternalRosSystem.g:3923:1: ( ( rule__ServiceClient__Group_5__0 )? )
            // InternalRosSystem.g:3924:2: ( rule__ServiceClient__Group_5__0 )?
            {
             before(grammarAccess.getServiceClientAccess().getGroup_5()); 
            // InternalRosSystem.g:3925:2: ( rule__ServiceClient__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:3925:3: rule__ServiceClient__Group_5__0
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
    // InternalRosSystem.g:3933:1: rule__ServiceClient__Group__6 : rule__ServiceClient__Group__6__Impl ;
    public final void rule__ServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3937:1: ( rule__ServiceClient__Group__6__Impl )
            // InternalRosSystem.g:3938:2: rule__ServiceClient__Group__6__Impl
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
    // InternalRosSystem.g:3944:1: rule__ServiceClient__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3948:1: ( ( '}' ) )
            // InternalRosSystem.g:3949:1: ( '}' )
            {
            // InternalRosSystem.g:3949:1: ( '}' )
            // InternalRosSystem.g:3950:2: '}'
            {
             before(grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
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
    // InternalRosSystem.g:3960:1: rule__ServiceClient__Group_3__0 : rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1 ;
    public final void rule__ServiceClient__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3964:1: ( rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1 )
            // InternalRosSystem.g:3965:2: rule__ServiceClient__Group_3__0__Impl rule__ServiceClient__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:3972:1: rule__ServiceClient__Group_3__0__Impl : ( 'ServiceName' ) ;
    public final void rule__ServiceClient__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3976:1: ( ( 'ServiceName' ) )
            // InternalRosSystem.g:3977:1: ( 'ServiceName' )
            {
            // InternalRosSystem.g:3977:1: ( 'ServiceName' )
            // InternalRosSystem.g:3978:2: 'ServiceName'
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRosSystem.g:3987:1: rule__ServiceClient__Group_3__1 : rule__ServiceClient__Group_3__1__Impl ;
    public final void rule__ServiceClient__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:3991:1: ( rule__ServiceClient__Group_3__1__Impl )
            // InternalRosSystem.g:3992:2: rule__ServiceClient__Group_3__1__Impl
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
    // InternalRosSystem.g:3998:1: rule__ServiceClient__Group_3__1__Impl : ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) ) ;
    public final void rule__ServiceClient__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4002:1: ( ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) ) )
            // InternalRosSystem.g:4003:1: ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:4003:1: ( ( rule__ServiceClient__ServiceNameAssignment_3_1 ) )
            // InternalRosSystem.g:4004:2: ( rule__ServiceClient__ServiceNameAssignment_3_1 )
            {
             before(grammarAccess.getServiceClientAccess().getServiceNameAssignment_3_1()); 
            // InternalRosSystem.g:4005:2: ( rule__ServiceClient__ServiceNameAssignment_3_1 )
            // InternalRosSystem.g:4005:3: rule__ServiceClient__ServiceNameAssignment_3_1
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
    // InternalRosSystem.g:4014:1: rule__ServiceClient__Group_4__0 : rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1 ;
    public final void rule__ServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4018:1: ( rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1 )
            // InternalRosSystem.g:4019:2: rule__ServiceClient__Group_4__0__Impl rule__ServiceClient__Group_4__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:4026:1: rule__ServiceClient__Group_4__0__Impl : ( 'SrvRef' ) ;
    public final void rule__ServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4030:1: ( ( 'SrvRef' ) )
            // InternalRosSystem.g:4031:1: ( 'SrvRef' )
            {
            // InternalRosSystem.g:4031:1: ( 'SrvRef' )
            // InternalRosSystem.g:4032:2: 'SrvRef'
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRosSystem.g:4041:1: rule__ServiceClient__Group_4__1 : rule__ServiceClient__Group_4__1__Impl ;
    public final void rule__ServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4045:1: ( rule__ServiceClient__Group_4__1__Impl )
            // InternalRosSystem.g:4046:2: rule__ServiceClient__Group_4__1__Impl
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
    // InternalRosSystem.g:4052:1: rule__ServiceClient__Group_4__1__Impl : ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) ) ;
    public final void rule__ServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4056:1: ( ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) ) )
            // InternalRosSystem.g:4057:1: ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) )
            {
            // InternalRosSystem.g:4057:1: ( ( rule__ServiceClient__SrvRefAssignment_4_1 ) )
            // InternalRosSystem.g:4058:2: ( rule__ServiceClient__SrvRefAssignment_4_1 )
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefAssignment_4_1()); 
            // InternalRosSystem.g:4059:2: ( rule__ServiceClient__SrvRefAssignment_4_1 )
            // InternalRosSystem.g:4059:3: rule__ServiceClient__SrvRefAssignment_4_1
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
    // InternalRosSystem.g:4068:1: rule__ServiceClient__Group_5__0 : rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1 ;
    public final void rule__ServiceClient__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4072:1: ( rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1 )
            // InternalRosSystem.g:4073:2: rule__ServiceClient__Group_5__0__Impl rule__ServiceClient__Group_5__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystem.g:4080:1: rule__ServiceClient__Group_5__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ServiceClient__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4084:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:4085:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:4085:1: ( 'NameSpace' )
            // InternalRosSystem.g:4086:2: 'NameSpace'
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRosSystem.g:4095:1: rule__ServiceClient__Group_5__1 : rule__ServiceClient__Group_5__1__Impl ;
    public final void rule__ServiceClient__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4099:1: ( rule__ServiceClient__Group_5__1__Impl )
            // InternalRosSystem.g:4100:2: rule__ServiceClient__Group_5__1__Impl
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
    // InternalRosSystem.g:4106:1: rule__ServiceClient__Group_5__1__Impl : ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) ) ;
    public final void rule__ServiceClient__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4110:1: ( ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) ) )
            // InternalRosSystem.g:4111:1: ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) )
            {
            // InternalRosSystem.g:4111:1: ( ( rule__ServiceClient__NameSpaceAssignment_5_1 ) )
            // InternalRosSystem.g:4112:2: ( rule__ServiceClient__NameSpaceAssignment_5_1 )
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceAssignment_5_1()); 
            // InternalRosSystem.g:4113:2: ( rule__ServiceClient__NameSpaceAssignment_5_1 )
            // InternalRosSystem.g:4113:3: rule__ServiceClient__NameSpaceAssignment_5_1
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


    // $ANTLR start "rule__RosSystem__NameAssignment_3_1"
    // InternalRosSystem.g:4122:1: rule__RosSystem__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4126:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4127:2: ( ruleEString )
            {
            // InternalRosSystem.g:4127:2: ( ruleEString )
            // InternalRosSystem.g:4128:3: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RosSystem__NameAssignment_3_1"


    // $ANTLR start "rule__RosSystem__RosComponentAssignment_4_1"
    // InternalRosSystem.g:4137:1: rule__RosSystem__RosComponentAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__RosSystem__RosComponentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4141:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4142:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4142:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4143:3: ( ruleEString )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_1_0()); 
            // InternalRosSystem.g:4144:3: ( ruleEString )
            // InternalRosSystem.g:4145:4: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__RosSystem__RosComponentAssignment_4_1"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_5_2"
    // InternalRosSystem.g:4156:1: rule__RosSystem__TopicConnectionsAssignment_5_2 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4160:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:4161:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:4161:2: ( ruleTopicConnection )
            // InternalRosSystem.g:4162:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_5_2"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_5_3_1"
    // InternalRosSystem.g:4171:1: rule__RosSystem__TopicConnectionsAssignment_5_3_1 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4175:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:4176:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:4176:2: ( ruleTopicConnection )
            // InternalRosSystem.g:4177:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_5_3_1"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_6_2"
    // InternalRosSystem.g:4186:1: rule__RosSystem__ServiceConnectionsAssignment_6_2 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4190:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:4191:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:4191:2: ( ruleServiceConnection )
            // InternalRosSystem.g:4192:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_6_2"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_6_3_1"
    // InternalRosSystem.g:4201:1: rule__RosSystem__ServiceConnectionsAssignment_6_3_1 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4205:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:4206:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:4206:2: ( ruleServiceConnection )
            // InternalRosSystem.g:4207:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_6_3_1"


    // $ANTLR start "rule__TopicConnection__FromAssignment_3_1"
    // InternalRosSystem.g:4216:1: rule__TopicConnection__FromAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__FromAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4220:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4221:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4221:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4222:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromPublisherCrossReference_3_1_0()); 
            // InternalRosSystem.g:4223:3: ( ruleEString )
            // InternalRosSystem.g:4224:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getFromPublisherEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getFromPublisherEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getFromPublisherCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__TopicConnection__FromAssignment_3_1"


    // $ANTLR start "rule__TopicConnection__ToAssignment_4_1"
    // InternalRosSystem.g:4235:1: rule__TopicConnection__ToAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__ToAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4239:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4240:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4240:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4241:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getToSubscriberCrossReference_4_1_0()); 
            // InternalRosSystem.g:4242:3: ( ruleEString )
            // InternalRosSystem.g:4243:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getToSubscriberEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getToSubscriberEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getToSubscriberCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__TopicConnection__ToAssignment_4_1"


    // $ANTLR start "rule__ServiceConnection__FromAssignment_3_1"
    // InternalRosSystem.g:4254:1: rule__ServiceConnection__FromAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__FromAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4258:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4259:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4259:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4260:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromServiceServerCrossReference_3_1_0()); 
            // InternalRosSystem.g:4261:3: ( ruleEString )
            // InternalRosSystem.g:4262:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getFromServiceServerEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getFromServiceServerEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getFromServiceServerCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__ServiceConnection__FromAssignment_3_1"


    // $ANTLR start "rule__ServiceConnection__ToAssignment_4_1"
    // InternalRosSystem.g:4273:1: rule__ServiceConnection__ToAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__ToAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4277:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4278:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4278:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4279:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getToServiceClientCrossReference_4_1_0()); 
            // InternalRosSystem.g:4280:3: ( ruleEString )
            // InternalRosSystem.g:4281:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getToServiceClientEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getToServiceClientEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getToServiceClientCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__ServiceConnection__ToAssignment_4_1"


    // $ANTLR start "rule__Publisher__TopicNameAssignment_3_1"
    // InternalRosSystem.g:4292:1: rule__Publisher__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Publisher__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4296:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4297:2: ( ruleEString )
            {
            // InternalRosSystem.g:4297:2: ( ruleEString )
            // InternalRosSystem.g:4298:3: ruleEString
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
    // InternalRosSystem.g:4307:1: rule__Publisher__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4311:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4312:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4312:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4313:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0()); 
            // InternalRosSystem.g:4314:3: ( ruleEString )
            // InternalRosSystem.g:4315:4: ruleEString
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
    // InternalRosSystem.g:4326:1: rule__Publisher__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4330:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4331:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4331:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4332:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalRosSystem.g:4333:3: ( ruleEString )
            // InternalRosSystem.g:4334:4: ruleEString
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
    // InternalRosSystem.g:4345:1: rule__Subscriber__TopicNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subscriber__TopicNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4349:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4350:2: ( ruleEString )
            {
            // InternalRosSystem.g:4350:2: ( ruleEString )
            // InternalRosSystem.g:4351:3: ruleEString
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
    // InternalRosSystem.g:4360:1: rule__Subscriber__TopicRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Subscriber__TopicRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4364:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4365:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4365:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4366:3: ( ruleEString )
            {
             before(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0()); 
            // InternalRosSystem.g:4367:3: ( ruleEString )
            // InternalRosSystem.g:4368:4: ruleEString
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
    // InternalRosSystem.g:4379:1: rule__Subscriber__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Subscriber__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4383:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4384:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4384:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4385:3: ( ruleEString )
            {
             before(grammarAccess.getSubscriberAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalRosSystem.g:4386:3: ( ruleEString )
            // InternalRosSystem.g:4387:4: ruleEString
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


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_2"
    // InternalRosSystem.g:4398:1: rule__GlobalNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4402:1: ( ( ruleGraphName ) )
            // InternalRosSystem.g:4403:2: ( ruleGraphName )
            {
            // InternalRosSystem.g:4403:2: ( ruleGraphName )
            // InternalRosSystem.g:4404:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_3_2"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_3_1"
    // InternalRosSystem.g:4413:1: rule__GlobalNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4417:1: ( ( ruleGraphName ) )
            // InternalRosSystem.g:4418:2: ( ruleGraphName )
            {
            // InternalRosSystem.g:4418:2: ( ruleGraphName )
            // InternalRosSystem.g:4419:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_3_3_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_3_2"
    // InternalRosSystem.g:4428:1: rule__RelativeNamespace_Impl__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4432:1: ( ( ruleGraphName ) )
            // InternalRosSystem.g:4433:2: ( ruleGraphName )
            {
            // InternalRosSystem.g:4433:2: ( ruleGraphName )
            // InternalRosSystem.g:4434:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_3_2"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1"
    // InternalRosSystem.g:4443:1: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4447:1: ( ( ruleGraphName ) )
            // InternalRosSystem.g:4448:2: ( ruleGraphName )
            {
            // InternalRosSystem.g:4448:2: ( ruleGraphName )
            // InternalRosSystem.g:4449:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_3_2"
    // InternalRosSystem.g:4458:1: rule__PrivateNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4462:1: ( ( ruleGraphName ) )
            // InternalRosSystem.g:4463:2: ( ruleGraphName )
            {
            // InternalRosSystem.g:4463:2: ( ruleGraphName )
            // InternalRosSystem.g:4464:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_3_2"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_3_3_1"
    // InternalRosSystem.g:4473:1: rule__PrivateNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4477:1: ( ( ruleGraphName ) )
            // InternalRosSystem.g:4478:2: ( ruleGraphName )
            {
            // InternalRosSystem.g:4478:2: ( ruleGraphName )
            // InternalRosSystem.g:4479:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_3_3_1"


    // $ANTLR start "rule__ServiceServer__ServiceNameAssignment_3_1"
    // InternalRosSystem.g:4488:1: rule__ServiceServer__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServiceServer__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4492:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4493:2: ( ruleEString )
            {
            // InternalRosSystem.g:4493:2: ( ruleEString )
            // InternalRosSystem.g:4494:3: ruleEString
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
    // InternalRosSystem.g:4503:1: rule__ServiceServer__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceServer__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4507:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4508:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4508:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4509:3: ( ruleEString )
            {
             before(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0()); 
            // InternalRosSystem.g:4510:3: ( ruleEString )
            // InternalRosSystem.g:4511:4: ruleEString
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
    // InternalRosSystem.g:4522:1: rule__ServiceServer__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceServer__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4526:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4527:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4527:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4528:3: ( ruleEString )
            {
             before(grammarAccess.getServiceServerAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalRosSystem.g:4529:3: ( ruleEString )
            // InternalRosSystem.g:4530:4: ruleEString
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
    // InternalRosSystem.g:4541:1: rule__ServiceClient__ServiceNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServiceClient__ServiceNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4545:1: ( ( ruleEString ) )
            // InternalRosSystem.g:4546:2: ( ruleEString )
            {
            // InternalRosSystem.g:4546:2: ( ruleEString )
            // InternalRosSystem.g:4547:3: ruleEString
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
    // InternalRosSystem.g:4556:1: rule__ServiceClient__SrvRefAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceClient__SrvRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4560:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4561:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4561:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4562:3: ( ruleEString )
            {
             before(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0()); 
            // InternalRosSystem.g:4563:3: ( ruleEString )
            // InternalRosSystem.g:4564:4: ruleEString
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
    // InternalRosSystem.g:4575:1: rule__ServiceClient__NameSpaceAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceClient__NameSpaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:4579:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:4580:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:4580:2: ( ( ruleEString ) )
            // InternalRosSystem.g:4581:3: ( ruleEString )
            {
             before(grammarAccess.getServiceClientAccess().getNameSpaceNamespaceCrossReference_5_1_0()); 
            // InternalRosSystem.g:4582:3: ( ruleEString )
            // InternalRosSystem.g:4583:4: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000BC000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001808004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});

}